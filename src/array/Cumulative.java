/**
 * 
 */
package array;

/**
 * @author Administrator
 *
 */

import java.util.Scanner;
public class Cumulative {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int length=sc.nextInt();
		
		
		int a[]=new int[length];
		int a1[]=new int[length];
		
		
		int sum=0;
		
		System.out.println("Enter the elements of the array");
		for(int i=0;i<length;i++) {
			a[i]=sc.nextInt();
			sum=sum+a[i];
			a1[i]=sum;
			
		}
		
		
		
		
		System.out.println("Final result is ");
		for(int i=0;i<length;i++) {
			System.out.println(a1[i]);
		}
		

	}

}
