/**
 * 
 */
package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Administrator
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer("600","Manu","1234567876","manusudi@gmail.com","Kerala");
		Customer c2=new Customer("200","Sanu","765439201","sanususan@gmail.com","Karnataka");
		Customer c3=new Customer("100","Janu","9432677876","januseei@gmail.com","Kerala");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a register Id :    ");
		String s=sc.next();
		
		
		//List<Customer> list=Arrays.asList(c1,c2,c3);
		//Customer lis = list.stream().filter(t->s.equals(t.getRegid())).findAny().orElse(null);   
		
			//	System.out.println(lis);
		
		List<Customer> list=Arrays.asList(c1,c2,c3);
		List<Customer> lis =list.stream().filter(t->t.getRegid().equals(s)).collect(Collectors.toList());
		
		if(lis.isEmpty()) {
			System.out.println("No records found");
		
				}
	else {
			for(Customer sss : lis) {
				System.out.println("ID : "+sss.getRegid()+"\n name : "+sss.getName()+ "\n Phone number : "+sss.getPhone()+  " \n Email : "+sss.getEmail()+ "\n Location  :  "+sss
						.getLoc());
			}
		}
		

	}

	private static String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String getRegid() {
		// TODO Auto-generated method stub
		return null;
	}

}
