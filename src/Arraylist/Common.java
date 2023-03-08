/**
 * 
 */
package Arraylist;

/**
 * @author Administrator
 *
 */

import java.io.*;
import java.util.*;
public class Common {

	/**
	 * @param args
	 */
	
	private static void FindCommonElement(int[] a1,int[] a2) 
	{
		Set<String>set=new HashSet<>();
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a2.length;j++) {
				if(a1[i]==a2[j]) {
					System.out.println("Array contains common elements");
					break;
				}
				else
					System.out.println("Array does not contain common elements");
					break;
					
				}
			}
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> s=new HashSet<Integer>();
		int a1[]= {1,2,3,4,5};
		int a2[]= {6,7,8,9,2};
		
		FindCommonElement(a1,a2);	
	}	
	}