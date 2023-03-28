/**
 * 
 */
package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class Testvehicle {

	/**
	 * @param args
	
    */
	@Test
	public void test() {
	String registeredVehicleNumber = "TS31C238";
	String expected="TS";
	String expected1="31";
	boolean actual1=Vehicle.isVehicleNumberValid(registeredVehicleNumber);
	String actual=Vehicle.printing(registeredVehicleNumber);
	assertEquals(expected,actual);
		
}
}
	
	
