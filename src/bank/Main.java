/**
 * 
 */
package bank;

/**
 * @author Administrator
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer(1234,"Ameena","am12@gmail.com");
		Savingsaccount s=new Savingsaccount(1234,c,20000,500);
		System.out.println(c.getCustomerId());
		System.out.println(c.getCustname());
		System.out.println(c.getEmailid());
		System.out.println(s.withdraw(1000));
		
		
		

	}

}
