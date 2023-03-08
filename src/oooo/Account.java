/**
 * 
 */
package oooo;

/**
 * @author Administrator
 *
 */
public class Account {
	String accountno;
	String customername;
	double bal;
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public Account(String accountno, String customername, double bal) {
		super();
		this.accountno = accountno;
		this.customername = customername;
		this.bal = bal;
	}
	
	

}
