package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CustomerRegisterDAO 
{
 
	public int insertdata(CustomerBean cbean)
	{
		
		int rowcount=0;
		try 
		{
			Connection con=DB_Connect.getcon();
			PreparedStatement pstmt=con.prepareStatement("insert into customer values(?,?,?,?,?,?,?)");
			pstmt.setString(1,cbean.getUname());
			pstmt.setString(2,cbean.getPwrd());
			pstmt.setString(3,cbean.getFname());
			pstmt.setString(4,cbean.getLname());
			pstmt.setString(5,cbean.getAddr());
			pstmt.setString(6,cbean.getMid());
			pstmt.setString(7,cbean.getPhno());
			
			rowcount=pstmt.executeUpdate();
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		return rowcount;
	}
	
	
}
