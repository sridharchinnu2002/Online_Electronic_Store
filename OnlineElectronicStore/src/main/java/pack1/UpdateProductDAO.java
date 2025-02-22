package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateProductDAO 
{
   
	public int updateproduct(ProductBean pbean)
	{
		int rowcount=0;
		try 
		{
			Connection con=DB_Connect.getcon();
			PreparedStatement pstmt=con.prepareStatement("update product set pprice=?,pqty=? where pcode=?");
			pstmt.setString(1,pbean.getPprice());
			pstmt.setString(2,pbean.getPqnty());
			pstmt.setString(3,pbean.getPcode());
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
