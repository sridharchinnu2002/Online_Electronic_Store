package pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Logout")
public class LogoutServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		HttpSession session=req.getSession(false);
		
	 	 if(session==null)
	 	 {
	 		req.setAttribute("msg","Session Experied");
	 		 RequestDispatcher rd=req.getRequestDispatcher("AdminLogin.html");
	 		 rd.forward(req, res);
	 	 }
	 	 else
	 	 {
	 		 req.getRequestDispatcher("Logout.jsp").forward(req, res);
	 		 
	 	 }
	}

}
