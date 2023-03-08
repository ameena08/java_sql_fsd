/**
 * 
 */
package bank;

/**
 * @author Administrator
 *
 */
public abstract class Account {
	protected int accountno;
	protected Customer customerobj;
	protected double balance;
	public Account(int accountno,Customer customerobj,double balance) {
		
		this.accountno = accountno;
		this.customerobj=customerobj;
		this.balance = balance;
		
		
		
	}
	public abstract boolean withdraw(double amount);

}
