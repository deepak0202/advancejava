package jdbcServlet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Conection 
{
	public static void main(String[] args)
	{
		FileInputStream fileInputStream =null;
		try 
		{
			fileInputStream = new FileInputStream("config.properties");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("file not found");
		}
		Properties properties = new Properties();
		try {
			properties.load(fileInputStream);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
	}

}
