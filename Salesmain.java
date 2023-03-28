/**
 * 
 */
package ustbatchno3.testNG;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Administrator
 *
 */
public class Salesmain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sales s1=new Sales("Hyderabad",2000,900);
		Sales s2=new Sales("TVM",1600,900);
		Sales s3=new Sales("Chennai",1800,1000);
		Sales s4=new Sales("Mumbai",1800,1200);
		Sales s5=new Sales("Cochin",1800,1200);
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the city");
		String s=sc.nextLine();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the squarefeet");
		int sss=sc1.nextInt();
		
		
		List<Sales>list= Arrays.asList(s1,s2,s3,s4,s5);
		List<Sales>l=list.stream().filter(t->t.getCity().equals(s)).collect(Collectors.toList());
		
	
		int amount = calculateAmount(s, sss);
		
        System.out.println("The amount for " + sss + " square feet in " + s + " is " + amount );
    }

	private static int calculateAmount(String s, int sss) {
		return sss*s.getpricewithmaterial();
		
		
		
	
	}
}



