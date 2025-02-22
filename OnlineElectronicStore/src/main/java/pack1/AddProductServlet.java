package pack1;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/aps")
public class AddProductServlet extends HttpServlet
{
	  @Override
      protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
      {
		  
    	  
    	  HttpSession session=req.getSession();
    	  if(session==null)
    	  {
    		  req.setAttribute("msg","session Expeired");
    		  RequestDispatcher rd=req.getRequestDispatcher("AdminLogin.html");
    		  rd.forward(req, res);
    		  
    	  }
    	  else
    	  {
    		  ProductBean pbean=new ProductBean();
    		  pbean.setPcode(req.getParameter("pcode"));
    		  pbean.setPname(req.getParameter("pname"));
    		  pbean.setPcompany(req.getParameter("pcompany"));
    		  pbean.setPprice(req.getParameter("pprice"));
    		  pbean.setPqnty(req.getParameter("pqnty"));
    		  if((req.getParameter("pcode")).equals("") ||(req.getParameter("pname")).equals("") ||(req.getParameter("pcompany")).equals("") ||(req.getParameter("pprice")).equals("") ||(req.getParameter("pqnty")).equals(""))
	          {
    		   req.setAttribute("invalid","invalid input");
			   RequestDispatcher rd=req.getRequestDispatcher("InvalidProductEntry.jsp");
			   rd.forward(req, res);
			   return;
	          }
				/*
				 * if((req.getParameter("pcode")).equals("")
				 * ||(req.getParameter("pname")).equals("")
				 * ||(req.getParameter("pcompany")).equals("")
				 * ||(req.getParameter("pprice")).equals("")
				 * ||(req.getParameter("pqnty")).equals("")) { return; }
				 */
    		  int rowcount=new AddProductDAO().addproduct(pbean);
    		  if(rowcount>0)
    		  {
    			  req.setAttribute("msg","Product details added succesfully");
    			  RequestDispatcher rd=req.getRequestDispatcher("AddProduct.jsp");
        		  rd.forward(req, res);
    		  }
    		  else
    		  {
    			  req.setAttribute("invalid","invalid input");
   			   RequestDispatcher rd=req.getRequestDispatcher("DuplicatePcode.jsp");
   			   rd.forward(req, res);
    		  }
    	  }
      }
}
