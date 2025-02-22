package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
public class DB_Connect 
{
	private static Connection conn=null;
	private DB_Connect(){}
	static
	{
		try
		{
		     Class.forName("oracle.jdbc.OracleDriver");
	         conn=DriverManager.getConnection(DBinfo.dburl,DBinfo.dbuname,DBinfo.dbpwd);
		} catch (Exception e)
		 {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
		}
		
	
	public static Connection getcon()
	{
		return conn;
	}

}