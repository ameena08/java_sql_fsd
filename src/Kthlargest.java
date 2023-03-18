/**
 * 
 */
package ustbatchno3.junit5testcases;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Optional;
import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Kthlargest {

	/**
	 * @param args
	 */
		    public static void main(String[] args) {
		        
		        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(10, 5, 20, 30, 15, 25,1,3,24));

		        Scanner sc=new Scanner(System.in);
		        System.out.println("Enter the number  :   ");
		        int n = sc.nextInt(); 
		         int nthLargest = linkedList.stream().distinct().sorted()
		        		.skip(n-1).findFirst().orElseThrow();
		            System.out.println(n + "th largest number is " + nthLargest);        	            
		    }	
	}



