/**
 * 
 */
package ustbatchno3.jdbc;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Kthlargest {
	
		public static void main(String args[]) {
	
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the number  :  ");
	     int n=sc.nextInt();
	     
	    
	     LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10,29,37,15,1,5,9,78));	
		 int kth =  list.stream().distinct() .sorted() 
		               .skip(n-1) 
		               .findFirst()
		               .orElseThrow();	
		 System.out.println(n+"th largest number is"+kth);
		}
	}






