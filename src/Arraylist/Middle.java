/**
 * 
 */
package Arraylist;

/**
 * @author Administrator
 *
 */
		

import java.util.LinkedList;

class Middle
{
	public static void main(String args[]) {
		  LinkedList<Integer> l1=new LinkedList<>();
		  l1.add(3);
		  l1.addFirst(4);
		  l1.addLast(9);
		  l1.addLast(12);
		  l1.addLast(14);
		  l1.addLast(13);
		  System.out.println("Linked List   :   "+l1);
		  int middle= l1.get(l1.size()/2);
		  System.out.println("Middle Element  :  "+middle);
	}		  

	}