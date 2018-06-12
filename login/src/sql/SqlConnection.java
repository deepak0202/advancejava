package sql;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class SqlConnection 
{
	public static Connection getConnectionObject()
	{
		Connection con=null;
		FileInputStream fileInputStream =null;
		try 
		{
			fileInputStream = new FileInputStream("/home/bridgeit/Desktop/advanceJava/login/config.properties");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("file not found");
		}
		Properties properties = new Properties();
		try 
		{
			properties.load(fileInputStream);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			
		}
		try 
		{
			
			Class.forName(properties.getProperty("driverName"));
			 con = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("userName"),properties.getProperty("password") );
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}	
		System.out.println("conection is return");
		return con;
	}
}
