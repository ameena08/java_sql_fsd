package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Administrator
 *
 */
public class City {

	

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		List<String> n=Arrays.asList("Kerala","TamilNadu","Karnataka","Delhi");
		List<String> m=n.stream().filter(t->t.startsWith("K")).collect(Collectors.toList());
		System.out.println(m);	

	}

	}


