package pack1;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/buy")
public class BuyProductServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		ProductBean pbean=new ProductBean();
		HttpSession session=req.getSession(false);
  	    if(session==null)
  	    {
  	    	req.setAttribute("msg","Session Experied");
  	    	RequestDispatcher rd=req.getRequestDispatcher("CustomerLogin.html");
  	    	rd.forward(req, res);
  	    }
  	    else
  	    {
  	    	  String pcode=req.getParameter("pcode");
  	    	  ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("ProductsList");
  	    	  ProductBean pb=null;
  			  Iterator<ProductBean> i=al.iterator();
  			  while( i.hasNext())
  			  {
  				 pb=i.next();
  				 if(pcode.equals(pb.getPcode()))
  				 {
  					 break;
  				 }
  			  }
  			  req.setAttribute("pbean", pb);
  	    	RequestDispatcher rd=req.getRequestDispatcher("BuyProduct.jsp");
  	    	rd.forward(req, res);
  	    }
	}
	

}
