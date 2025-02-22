package pack1;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
@WebListener
public class SessionListner  implements HttpSessionListener,HttpSessionAttributeListener
{
	@Override
	public void sessionCreated(HttpSessionEvent se) 
	{
		// TODO Auto-generated method stub
		System.out.println("session ceated");
	}
	@Override
	public void sessionDestroyed(HttpSessionEvent se) 
	{
		// TODO Auto-generated method stub
		System.out.println("session destroyed");
	}
	
	
	@Override
	public void attributeAdded(HttpSessionBindingEvent se) 
	{
		// TODO Auto-generated method stub
		System.out.println("attribute added");
	}
	
	
	@Override
	public void attributeRemoved(HttpSessionBindingEvent se) 
	{
		// TODO Auto-generated method stub
		System.out.println("attribute removed");
	}
	
	@Override
	public void attributeReplaced(HttpSessionBindingEvent se) 
	{
		// TODO Auto-generated method stub
		System.out.println("attribute replaceds");
	}
	
	
	
	
	
	
	
	
	

}
