/**
 * 
 */
package test;

/**
 * @author Administrator
 *
 */
public class Hotel {

	private String regid;
	public String adhar;
	public String name;
	public String email;
	public String loc;
	public int budget;
	
	public Hotel(String regid, String adhar, String name, String email, String loc) {
		super();
		this.regid = regid;
		this.adhar = adhar;
		this.name = name;
		this.email = email;
		this.loc = loc;
	}
	public String getRegid() {
		return regid;
	}
	public void setRegid(String regid) {
		this.regid = regid;
	}
	public String getAdhar() {
		return adhar;
	}
	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		
		public int getBudget() {
			return budget;
		}
		public void setBudget(int budget) {
			this.budget = budget;
	}
}
