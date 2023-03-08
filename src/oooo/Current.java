/**
 * 
 */
package oooo;



/**
 * @author Administrator
 *
 */
public class Current extends Account implements Maintenance {

	public Current(String accountno, String customername, double bal) {
		super(accountno, customername, bal);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public float calculatemaintenancecharge(float noofyears) {
		// TODO Auto-generated method stub
		int m=50;
		float calculatemaintenancecharge = (noofyears*m)+50;
	    return calculatemaintenancecharge;
	}

}
