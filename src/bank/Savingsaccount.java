/**
 * 
 */
package bank;

/**
 * @author Administrator
 *
 */
public class Savingsaccount extends Account {
	private double minimumbalance;

	public Savingsaccount(int accountno,Customer customerobj, double balance, double minimumbalance) {
	super(accountno,customerobj,balance);	
		this.minimumbalance = minimumbalance;
	}

	@Override
	public boolean withdraw(double amount) {
		
		// TODO Auto-generated method stub
		if(balance-amount>minimumbalance)
		{
			 balance = balance-amount;
			 System.out.println("balance is " +balance);
			 return true;
			 
		}
		else {
			return false;
		}
		
	}
	

}
