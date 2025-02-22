package pack1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Update")
public class UpdateProductServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
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
	 		   String pcode=req.getParameter("PCode");
			   ArrayList<ProductBean> al=(ArrayList<ProductBean>) session.getAttribute("ProductsList");
			   ProductBean pb=new ProductBean();
			 //  ProductBean pb=null;
			  Iterator<ProductBean> i=al.iterator();
			  while( i.hasNext())
			  {
				 pb=i.next();
				 if(pcode.equals(pb.getPcode()))
				 {
					 break;
				 }
			  }
			  pb.setPprice(req.getParameter("pprice"));
			  pb.setPqnty(req.getParameter("pqnty"));
			  
			  int rowcount=new UpdateProductDAO().updateproduct(pb);
			  if(rowcount>0)
			  {
				  req.setAttribute("msg","Product details Updated..!!");
				   RequestDispatcher rd=req.getRequestDispatcher("UpdateProduct.jsp"); 
				   rd.forward(req, res); 
			  }
	 	 }
	}

}
