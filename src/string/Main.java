/**
 * 
 */
package string;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Main {

	private static final String name = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Employees  :  ");
		int employeeNo=sc.nextInt();
		Employee[] empArr=new Employee[employeeNo];
		for(int i=0;i<employeeNo;i++) {
			
			System.out.println("Enter Employee name  :  ");
			String name=sc.next();
			System.out.println("Enter employee id  :  ");
			String id=sc.next();
			
			System.out.println("Enter employee salary  :  ");
			double salary=sc.nextDouble();
			empArr[i]=new Employee(name,id,salary);
		}
		Arrays.sort(empArr);
		System.out.println(" Default sorting of Employees  : \n"+Arrays.toString(empArr));
		Arrays.sort(empArr,Employee.SalaryComparator);
		System.out.println("Employees sorted by salary  :  \n"+Arrays.toString(empArr));
		
		System.out.println("Employess after salary increment  :  \n"+Arrays.toString(EmployeeIncrement.salaryIncrement(empArr)));
		}
		
		
		

	}


