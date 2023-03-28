/**
 * 
 */
package ustbatchno3.testNG;

/**
 * @author Administrator
 *
 */
public class Sales {
	public String city;
	public int pricewithmaterial;
	public int pricewithoutmaterial;
	public Sales(String city, int pricewithmaterial, int pricewithoutmaterial) {
		super();
		this.city = city;
		this.pricewithmaterial = pricewithmaterial;
		this.pricewithoutmaterial = pricewithoutmaterial;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public  int getPricewithmaterial() {
		return pricewithmaterial;
	}
	public void setPricewithmaterial(int pricewithmaterial) {
		this.pricewithmaterial = pricewithmaterial;
	}
	public  int getPricewithoutmaterial() {
		return pricewithoutmaterial;
	}
	public void setPricewithoutmaterial(int pricewithoutmaterial) {
		this.pricewithoutmaterial = pricewithoutmaterial;
	}	
	}
	

