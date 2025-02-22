package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddProductDAO 
{
	
	public int addproduct(ProductBean pbean)
	{
		int rowcount=0;
		try 
		{
			Connection con=DB_Connect.getcon();
			PreparedStatement pstmt=con.prepareStatement("insert into product values(?,?,?,?,?)");
			pstmt.setString(1,pbean.getPcode());
			pstmt.setString(2,pbean.getPname());
			pstmt.setString(3,pbean.getPcompany());
			pstmt.setString(4,pbean.getPprice());
			pstmt.setString(5,pbean.getPqnty());
			
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
