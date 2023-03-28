package ustbatchno3.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class Employeetest
{
	@Test
	public void testofemployee(){
		Employee e=new Employee("Ameena",22,"Developer");
		Assert.assertEquals(e.getName(),"Ameena");
		
	}
    
}
