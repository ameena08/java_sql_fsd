/**
 * 
 */
package string;

/**
 * @author Administrator
 *
 */

import java.util.Scanner;
public class Reverse {
	
	public static String reverse(String S) {
		String rev = " ";
		
		for(int i=0;i<=S.length()-1;i++) {
			rev=rev+S.charAt(i);
			
		}
		return rev;
		
	}

	/**
	 * @param args
	 * @param String 
	 */
	public static void main(String[] args, String String) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int S=sc.nextInt();
		
		reverse(String);
	

}
}
