package conroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */
public class Registration extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		
		sql.Insert.insertInLogin(request.getParameter("userName"), request.getParameter("password"));
		sql.Insert.insertInUserDetail(request.getParameter("userName"),
				request.getParameter("firstName"), request.getParameter("lastName"), request.getParameter("age"));
		PrintWriter printWriter = response.getWriter();
		printWriter.print("you have succesful register");
		
	}

}
