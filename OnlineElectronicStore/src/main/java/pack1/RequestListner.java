package pack1;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
//@WebListener
public class RequestListner implements ServletRequestListener,ServletRequestAttributeListener
{
     @Override
    public void requestInitialized(ServletRequestEvent sre) 
     {
    	// TODO Auto-generated method stub
    	System.out.println("request object Initialized");
    }
     @Override
    public void requestDestroyed(ServletRequestEvent sre)
     {
    	// TODO Auto-generated method stub
    	 System.out.println("request object destroyed");
    }
     
     @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) 
     {
    	// TODO Auto-generated method stub
    	 System.out.println("Attribute added to servletrequest");
    	 System.out.println("===>"+srae.getName());
    }
     
     @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) 
     {
    	// TODO Auto-generated method stub
    	 System.out.println("Attribute removed to servletrequest");
    }
    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) 
    {
    	// TODO Auto-generated method stub
    	 System.out.println("Attribute replaced to servletrequest");
    }
     
     
     
     
}

