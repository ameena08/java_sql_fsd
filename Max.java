/**
 * 
 */
package ustbatchno3.exception;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author Administrator
 *
 */
public class Max {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>n=Arrays.asList(2,4,1,8);
		Optional<Integer>num=n.stream().sorted( Comparator.reverseOrder()).findFirst();
//		int max = n.stream().max(Integer::compareTo).orElse(0);
//		System.out.println("Max: " + max);
		System.out.println(num);

	}

}
