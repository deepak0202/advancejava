package sql;

public class Validate 
{
	public static boolean loginValidate(String userName, String password)
	{
		String sql = "select * from login where name = '"+userName+"' and password = '"+password+"'";
		return true;
	}

}
