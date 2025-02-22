package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateAfterBuyingDAo 
{
	public int updateitems(String qnty,String pcode)
	{
		int rowcount=0;
		
		try 
		{
			Connection con=DB_Connect.getcon();
			PreparedStatement pstmt=con.prepareStatement("update product set pqty=? where pcode=?");
			pstmt.setString(1,qnty);
			pstmt.setString(2,pcode);
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
