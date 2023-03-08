/**
 * 
 */
package test;

/**
 * @author Administrator
 *
 */
public class Customer {
	private String regid;
	public String name;
	public String phone;
	public String email;
	public String loc;
	public Customer(String regid, String name, String phone, String email, String loc) {
		super();
		this.regid = regid;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.loc = loc;
	}
	public String getRegid() {
		return regid;
	}
	public void setRegid(String regid) {
		this.regid = regid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	//@Override
//	public String toString() {
//		return "Customer [regid=" + regid + ", name=" + name + ", phone=" + phone + ", email=" + email + ", loc=" + loc
//				+ "]";

}
	
	
	
	

