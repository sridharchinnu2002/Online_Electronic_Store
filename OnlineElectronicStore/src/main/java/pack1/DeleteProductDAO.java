package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteProductDAO 
{
  
	public int deleteproduct(ProductBean pbean)
	{
		int rowcount=0;
		try 
		{
			 Connection con=DB_Connect.getcon();
			 PreparedStatement pstmt=con.prepareStatement("delete from product where pcode=?");
			 pstmt.setString(1,pbean.getPcode());
			 rowcount=pstmt.executeUpdate();
			 
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		return rowcount;
	}
	
	
}
