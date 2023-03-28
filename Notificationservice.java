/**
 * 
 */
package ustbatchno3.com.autowiring;

/**
 * @author Administrator
 *
 */
public class Notificationservice {
	private Messageservices messageservices;
	public void Notifyservices() {
		System.out.println("Hi I am autowired");
	}
	public void setMessageservices(Messageservices messageservices) {
		this.messageservices = messageservices;
	}
}
