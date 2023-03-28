package ustbatchno3.Constructorinjuction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    ApplicationContext context =   
    new ClassPathXmlApplicationContext("application1.xml"); 
    Roles s=context.getBean("Hi",Roles.class);
    s.display();
//    Roles t=context.getBean("Hello",Roles.class);
//    t.display();
//    Roles u=context.getBean("new",Roles.class);
//    u.display();
//    Roles v=context.getBean("jam",Roles.class);
//    v.display();
//    Roles w=context.getBean("jin",Roles.class);
//    w.display();
}
}
