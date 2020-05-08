package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.UserVO2;

// ~~DAO(Data Access Object) : 데이터베이스와 관련한 작업을 하는 클래스
// ~~VO, ~~DTO : 값들을 객체로 처리하는 클래스(바구니)
public class UserDAO2 {
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		Connection con = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		
		String user = "javadb";
		String password = "12345";
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;		
	}// getConnection close
	
	public int insertUser(String username,int birthYear,String addr) {
		int result = 0;
		
		String sql = "insert into userTBL(username,birthYear,addr) values(?,?,?)";
		
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {

			pstmt.setString(1, username); 
			pstmt.setInt(2, birthYear);
			pstmt.setString(3, addr);	
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}// insertUser 종료
	
	public UserVO2 getUser(int no) {
		
		String sql = "select * from userTBL where no=?";
		UserVO2 vo = null;
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			pstmt.setInt(1, no);
			
			// select
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				vo = new UserVO2();
				vo.setNo(rs.getInt("no"));
				vo.setUsername(rs.getString("username"));
				vo.setBirthYear(rs.getInt("birthYear"));
				vo.setAddr(rs.getString("addr"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}// getUser 종료
	
	public List<UserVO2> getList() {
		List<UserVO2> list = new ArrayList<UserVO2>();
		
		String sql = "select * from userTBL";
		
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				UserVO2 vo = new UserVO2();
				vo.setNo(rs.getInt("no"));
				vo.setUsername(rs.getString("username"));
				vo.setBirthYear(rs.getInt("birthYear"));
				vo.setAddr(rs.getString("addr"));
				list.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}// getList 종료
	
	public int updateUser(UserVO2 vo) {
		int result = 0;
		String sql = "update userTBL set username=?,birthYear=?,addr=? where no=?";
		try (Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){

			pstmt.setString(1, vo.getUsername());
			pstmt.setInt(2, vo.getBirthYear());
			pstmt.setString(3, vo.getAddr());
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
