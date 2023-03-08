/**
 * 
 */
package test;

/**
 * @author Administrator
 *
 */
public class Crud {
	private String uid;
	private String name;
	private String price;
	private String food;
	private String no;
	public Crud(String no,String uid, String name) {
		super();
		this.uid = uid;
		this.name = name;
		this.no=no;
		
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return name;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	
	
	
}
