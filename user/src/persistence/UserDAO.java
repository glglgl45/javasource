package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.UserVO;

// ~~DAO(Data Access Object) : 데이터베이스와 관련한 작업을 하는 클래스
// ~~VO, ~~DTO : 값들을 객체로 처리하는 클래스(바구니)
public class UserDAO {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		Connection con = null;
		
		String url = "jdbc:mysql://localhost:3306/javadb?useSSL=false&serverTimezone=UTC";
		
		String user = "javadb";
		String password = "12345";
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;		
	}// getConnection close
	
	public int insertUser(String name,String birthYear,String address) {
		int result = 0;
		
		String sql = "insert into userTBL(name,birthday,address) values(?,?,?)";
		
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {

			pstmt.setString(1, name); 
			pstmt.setString(2, birthYear);
			pstmt.setString(3, address);	
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}// insertUser 종료
	
	public UserVO getUser(int no) {
		
		String sql = "select * from userTBL where no=?";
		UserVO vo = null;
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			pstmt.setInt(1, no);
			
			// select
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				vo = new UserVO();
				vo.setNo(rs.getInt("no"));
				vo.setName(rs.getString("name"));
				vo.setBirthday(rs.getString("birthday"));
				vo.setAddress(rs.getString("address"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}// getUser 종료
	
	public List<UserVO> getList() {
		List<UserVO> list = new ArrayList<UserVO>();
		
		String sql = "select * from userTBL";
		
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				UserVO vo = new UserVO();
				vo.setNo(rs.getInt("no"));
				vo.setName(rs.getString("name"));
				vo.setBirthday(rs.getString("birthday"));
				vo.setAddress(rs.getString("address"));
				list.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}// getList 종료
	
	public int updateUser(UserVO vo) {
		int result = 0;
		String sql = "update userTBL set name=?,birthday=?,address=? where no=?";
		try (Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){

			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getBirthday());
			pstmt.setString(3, vo.getAddress());
			pstmt.setInt(4, vo.getNo());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}			
		return result;
	} // updateUser 종료
	
	public int deleteUser(int no) {
		int result = 0;
		
		String sql = "delete from userTBL where no=?";
		
		try(Connection con=getConnection();
			PreparedStatement pstmt=con.prepareStatement(sql)) {			
			pstmt.setInt(1, no);			
			result=pstmt.executeUpdate();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	} // deleteUser 종료
}
