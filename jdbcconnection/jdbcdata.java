package dbconnection.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcdata{

	public static void main(String[] args) throws SQLException, ClassNotFoundException  {
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
		ps.setString(1, "Reddy");
		ps.setString(2,"Rewat");
		int rowsAffected = ps.executeUpdate();
		if (rowsAffected>0) {
		System.out.println("insertion successful");	
		}
		else {
			System.out.println("insertion failed");
		}
	
}
}
