package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.BookVO;

public class BookDAO {
	static {
		try {
			// 드라이버 클래스 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// Connection 처리
	public Connection getConnection() {
		Connection con = null;
		
		String url = "jdbc:mysql://localhost:3306/javadb?"
				+ "useSSL=false&serverTimezone=UTC";
		String user = "javadb";
		String password = "12345";
		
		try {
			con = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	// 도서 정보 입력
	public int insertBook(BookVO vo) {
		int result = 0;
		
		String sql = "insert into bookTBL(code,title,writer,price) values(?,?,?,?)";
		
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, vo.getCode());
			pstmt.setString(2, vo.getTitle());
			pstmt.setString(3, vo.getWriter());
			pstmt.setInt(4, vo.getPrice());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	// 도서 정보 조회
	public BookVO getRow(String code) {
		String sql = "select * from bookTBL where code=?";
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);) {
			
			pstmt.setString(1, code);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				return new BookVO(	rs.getString("code"),
									rs.getString("title"),
									rs.getString("writer"),
									rs.getInt("price"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// 도서 정보 삭제
	public int deleteBook(String code) {
		int result = 0;
		String sql = "delete from bookTBL where code=?";
		
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, code);

			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	// 도서 정보 수정 (가격변경)
	public int updateBook(String code,int price) {
		int result = 0;
		
		String sql = "update bookTBL set price=? where code=?";
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, price);
			pstmt.setString(2, code);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	// 도서 정보 전체 조회
	public List<BookVO> listBook() {
		List<BookVO> list = new ArrayList<BookVO>();
		String sql = "select * from bookTBL";
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery()) {
			
			while (rs.next()) {
				BookVO vo = new BookVO(	rs.getString("code"), 
										rs.getString("title"), 
										rs.getString("writer"), 
										rs.getInt("price"));
//				BookVO vo = new BookVO();
//				vo.setCode(rs.getString("code"));
//				vo.setTitle(rs.getString("title"));
//				vo.setWriter(rs.getString("writer"));
//				vo.setPrice(rs.getInt("price"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
