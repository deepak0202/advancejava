package conroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(sql.Insert.loginValidate(request.getParameter("userName"), request.getParameter("password")))
		{
			System.out.println("servlet");
			HttpSession session =request.getSession();
			session.setAttribute("userName", request.getParameter("userName"));
			response.sendRedirect("display.jsp");
//			RequestDispatcher requestDispatcher=request.getRequestDispatcher("").forward(request, response);
		}
		else
		{
			PrintWriter printWriter = response.getWriter();
			printWriter.println("invalid user details");
			
		}
		
		
		
	}

}
