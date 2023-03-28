/**
 * 
 */
package ustbatchno3.junit5testcases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vehicle{

	    
	        
	        
	        public static boolean isVehicleNumberValid(String registeredvehicleNumber) {
	        	
	        	
	    		
	            Pattern pattern = Pattern.compile("[A-Z]{2}\\s[0-9]{2}\\s[A-Z]{2}\\s[0-9]{4}");
	            Matcher matcher = pattern.matcher(registeredvehicleNumber);
	            return matcher.matches();
	        }
	        
	        public static String printing(String registeredvehicleNumber) {
			String stateCode = registeredvehicleNumber.substring(0, 2);
	        String districtCode = registeredvehicleNumber.substring(2, 4);
	        
	        System.out.println("State: " + stateCode);
	        System.out.println("District: " + districtCode);
			return districtCode;
            
		
	     
	    }

	    }

