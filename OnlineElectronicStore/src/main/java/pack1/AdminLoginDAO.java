package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminLoginDAO 
{
   public AdminBean checkAdminLogin(String ausername,String apassword)
   {
	   AdminBean abean=null;
	   try 
	   {
		Connection con=DB_Connect.getcon();
		PreparedStatement pstmt=con.prepareStatement("select * from admin where uname=? and pwrd=?");
		pstmt.setString(1,ausername);
		pstmt.setString(2,apassword);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next())
		{
			abean=new AdminBean();
			abean.setUname(rs.getString(1));
			abean.setPwrd(rs.getString(2));
			abean.setFname(rs.getString(3));
			abean.setLname(rs.getString(4));
			abean.setAddr(rs.getString(5));
			abean.setMid(rs.getString(6));
			abean.setPhno(rs.getString(7));
			
		}
	  } 
	   catch (Exception e) 
	   {
		   e.printStackTrace();
	   }

	   return abean;
   }
	
	
}
