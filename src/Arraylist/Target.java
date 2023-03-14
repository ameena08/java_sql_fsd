*/Write a program to print only the elements of ArrayList whose sum is 25 */


/**
 * 
 */
package Arraylist;

/**
 * @author Administrator
 *
 */

import java.util.*;
public class Target {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(3);
		list.add(22);
		
		for(int i=0;i<6;i++)
			for(int j=i+1;j<6;j++)
			{
				if(list.get(i)+list.get(j)==25)
				{
					System.out.println(list.get(i));
					System.out.println(list.get(j));
				}
			}
		
	}

}
