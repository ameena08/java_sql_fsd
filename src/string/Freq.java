/**
 * 
 */
package string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Administrator
 *
 */
public class Freq {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> n=Arrays.asList("Anu","Manu","Anu","Sanu");
		List<String> m=n.stream().filter(i->Collections.frequency(n,i)>1).collect(Collectors.toList());
		long total=m.stream().count();
		System.out.println(total);
		
	
	}

	
	
}
