package pgm.sam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlPractise {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HR","admin");
		
		String sql="select * from country";
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet rs = statement.executeQuery();
		
		while(rs.next()) {
			int int1 = rs.getInt("");
			System.out.println(int1);
			String string = rs.getString("");
			System.out.println(string);
			
		}
		
		
		
	}

}
