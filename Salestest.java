/**
 * 
 */
package ustbatchno3.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Administrator
 *
 */
public class Salestest {
	
	@Test
	public void testofemployee(){
		Sales s=new Sales("Mumbai",2500,1200);
		Assert.assertEquals(s.getCity(),"Mumbai");
	

}
}
