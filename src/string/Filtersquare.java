package string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Administrator
 *
 */
public class Filtersquare {

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> n=Arrays.asList(2,3,4,5);
		List<Integer> squares=n.stream().map(t->t*t).collect(Collectors.toList());
		System.out.println(squares);
		

	}

}