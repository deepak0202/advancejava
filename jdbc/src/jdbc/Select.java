package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Select 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/deepak","root","root");
			Statement statement = con.createStatement();
			String sql = "select * from tab1";
			statement.execute(sql);
			System.out.println("done");
		}
		catch (ClassNotFoundException e) 
		{
			System.out.println("driver loading problem");
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			System.out.println("conection problem");
			e.printStackTrace();
		}
		
	}

}
