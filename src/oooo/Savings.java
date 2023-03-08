/**
 * 
 */
package oooo;

/**
 * @author Administrator
 *
 */

public class Savings extends Account implements Maintenance {
	public Savings(String accountno, String customername, double bal) {
		super(accountno, customername, bal);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public float calculatemaintenancecharge(float noofyears) {
		// TODO Auto-generated method stub
		int m=100;
		float maintenancecharge = (noofyears*m)+50;
		System.out.println("Maintenance charge for savings account :");
		return maintenancecharge;
	
	}
	

		
		
}
