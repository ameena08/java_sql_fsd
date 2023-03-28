/**
 * 
 */
package ustbatchno3.com.autowiring;

/**
 * @author Administrator
 *
 */
public class SMSservices implements Messageservices {
	public void sendmessages(String message) {
		System.out.println("I am from SMS Services");
	}

}
