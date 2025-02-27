package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcdata {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.
				getConnection("jdbc:mysql://localhost:3306/jdbcdata","root","Mysql@123");
		if(con!=null) {
			System.out.println("done");
				
			}
		else {
			System.out.println("not done");
		}
		
		String query ="insert into Student values(?,?)";
		PreparedStatement ps= con.prepareStatement(query);
		ps.setString(1,"reddy");
		ps.setString(2,"rewat");
		int rowsAffected = ps.executeUpdate();
		if (rowsAffected>0) {
		System.out.println("insertion successful");	
		}
		else {
			System.out.println("insertion failed");
		}
	
}
}