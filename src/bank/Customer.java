/**
 * 
 */
package bank;

/**
 * @author Administrator
 *
 */
public class Customer {

	/**
	 * 
	 */
		// TODO Auto-generated constructor stub
		private int customerId;
		private String custname;
		private String emailid;
		
		
		
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public String getCustname() {
			return custname;
		}
		public void setCustname(String custname) {
			this.custname = custname;
		}
		public String getEmailid() {
			return emailid;
		}
		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}
		public Customer(int customerId, String custname, String emailid) {
			
			this.customerId = customerId;
			this.custname = custname;
			this.emailid = emailid;
		}		

}
