//package pack1;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.ArrayList;
//
//public class BuyProductDAO 
//{
//	ArrayList<ProductBean> al=new ArrayList<ProductBean>();
//    public ArrayList<ProductBean> retriveitemdetails(ProductBean pbean)
//    {
//    	
//    	try 
//    	{
//			Connection con=DB_Connect.getcon();
//			PreparedStatement pstmt=con.prepareStatement("select * from product where pcode=?");
//			pstmt.setString(1,pbean.getPcode());
//			ResultSet rs=pstmt.executeQuery();
//			if(rs.next())
//			{
//				al.add(rs.getString(1)+" "+rs.getString(1)+" "+rs.getString(1)+" "+rs.getString(1)+" "+rs.getString(1));
//			}
//		} 
//    	catch (Exception e) 
//    	{
//    		e.printStackTrace();
//			// TODO: handle exception
//		}
//    	return al;
//    	
//    }
