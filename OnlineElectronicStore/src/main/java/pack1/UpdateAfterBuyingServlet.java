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
@WebServlet("/pqnty")
public class UpdateAfterBuyingServlet  extends HttpServlet
{
	@Override
	   protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	   {
		   String iqnty="nostock";
		   HttpSession session=req.getSession(false);
		   if(session==null)
		   {
			   req.setAttribute("msg","session Eperied");
			   RequestDispatcher rd=req.getRequestDispatcher("CustomerLogin.html"); 
			   rd.forward(req, res);
			   
		   }
		   else
		   {
			   String pcode=req.getParameter("pcode");
			   ProductBean pb=new ProductBean();
			   //String q=pb.getPqnty();
			  
			  // int aqnty=Integer.parseInt(pb.getPqnty());
			   int aqnty=Integer.parseInt(req.getParameter("pqnty"));
			   int rqnty=Integer.parseInt(req.getParameter("qnty"));
			   String uqnty=String.valueOf(aqnty-rqnty); 
			   ArrayList<ProductBean> al=(ArrayList<ProductBean>) session.getAttribute("ProductsList");
			   Iterator<ProductBean> i=al.iterator();
			   if(rqnty<=aqnty)
			   {
				   int rowcount=new UpdateAfterBuyingDAo().updateitems(uqnty,req.getParameter("pcode"));
				   if(rowcount>0)
				   {
					   while( i.hasNext())
						  {
							 pb=i.next();
							 if(pcode.equals(pb.getPcode()))
							 {
								 break;
							 }
						  }
					   req.setAttribute("pbean",pb);
					   req.setAttribute("rqnty",rqnty);
					   RequestDispatcher rd=req.getRequestDispatcher("OrderConfirmed.jsp"); 
					   rd.forward(req, res);
				   }
				 
			   }
			   else
			   {
//				     HttpSession session2=req.getSession();
//				     session2.setAttribute("invalidqnty",iqnty);
				     System.out.println("insufficient qnty");
                     new CustomerViewProductServlet().doGet(req, res);
                     
		  	    	
			   }
		   }
	   }
}
