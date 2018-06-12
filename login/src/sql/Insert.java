package sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert 
{
	static Connection con = SqlConnection.getConnectionObject();
	public static boolean insertInLogin(String userName,String password)
	{
		Statement statement = null;
		boolean inserted = false;
//		Connection con = SqlConnection.getConnectionObject();
		try 
		{
			statement = con.createStatement();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		String sql = "insert into login values('"+userName+"','"+password+"')";
		System.out.println(sql);
		try 
		{
			statement.execute(sql);
			inserted = true;
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
			return inserted;
	}
	public static boolean insertInUserDetail(String userName,String firstName,String lastName,String age)
	{
		boolean inserted = false;
		Statement statement = null;
//		Connection con = SqlConnection.getConnectionObject();
		try 
		{
			statement = con.createStatement();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		String sql = "insert into userdetail values('"+userName+"','"+firstName+"','"+lastName+"','"+age+"')";
		try 
		{
			statement.execute(sql);
			inserted = true;
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return inserted;
	}
	
	public static boolean loginValidate(String userName, String password)
	{
		boolean present = false;
		ResultSet rs=null;
		String sql = "select * from login where name = '"+userName+"' and password = '"+password+"'";
		Statement statement = null;
		try 
		{
			statement = con.createStatement();
			 rs = statement.executeQuery(sql);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		try 
		{
			if(rs.next())
			{
				present = true;
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return present;
	}
	public static ResultSet getDetails(String userName)
	{
		String sql = "select * from userdetail where user_name = '"+userName+"'";
		Statement statement=null;
		try 
		{
			statement = con.createStatement();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		ResultSet resultSet = null;
		try 
		{
		resultSet =	statement.executeQuery(sql);
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return resultSet;
	}
	
	
}
