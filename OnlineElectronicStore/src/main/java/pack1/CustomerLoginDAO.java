package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerLoginDAO 
{
    public CustomerBean checkcustomerlogin(String username,String password)
    {
    	CustomerBean cbean=null;
    	try 
    	{
			Connection con=DB_Connect.getcon();
			PreparedStatement pstmt=con.prepareStatement("select * from customer where uname=? and pwrd=?");
			pstmt.setString(1,username);
			pstmt.setString(2, password);
		 	ResultSet rs=pstmt.executeQuery();
		 	while(rs.next())
		 	{
		 		cbean=new CustomerBean();
		 		cbean.setUname(rs.getString(1));
		 		cbean.setPwrd(rs.getString(2));
		 		cbean.setFname(rs.getString(3));
		 		cbean.setLname(rs.getString(4));
		 		cbean.setAddr(rs.getString(5));
		 		cbean.setMid(rs.getString(6));
		 		cbean.setPhno(rs.getString(7));
		 	}
			
		} 
    	catch (Exception e) 
    	{
			// TODO: handle exception
    		e.printStackTrace();
		}
    	return cbean;
    	
    }
}
