/**
 * 
 */
package Arraylist;

/**
 * @author Administrator
 *
 */

import java.util.*;
public class iteration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList<String>();
		list.add("Mango");
		list.add("Orange");
		list.add("Grapes");
		list.add("Strawberry");
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
