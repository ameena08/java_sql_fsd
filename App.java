package ustbatchno3.com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =   
    		    new ClassPathXmlApplicationContext("application.xml");
    	Notificationservice s=context.getBean("hi",Notificationservice.class);
    	s.Notifyservices();
    	Emailservice t=context.getBean("hello",Emailservice.class);
    	t.sendmessages("Hi hello");
    	SMSservices u=context.getBean("ho",SMSservices.class);
    	u.sendmessages("jo");
    }
}
