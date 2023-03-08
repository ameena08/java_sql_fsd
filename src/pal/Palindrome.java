/**
 * 
 */
package pal;

/**
 * @author Administrator
 *
 */

import java.util.Scanner;
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int temp=0;
		int r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number   :   ");
		
		int n=sc.nextInt();
		temp=n;
		
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}

		if(temp==sum) {
			System.out.println("Number is a Palindrome");
		}
		else
			System.out.println("Number is not a Palindrome");
	}
}
			
		
		
		
		
		
		
			
					
					
				