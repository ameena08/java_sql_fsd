package ustbatchno3_sonarcube;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import ustbatchno3_sonarcube.Employee;

/**
 * @author Administrator
 *
 */
public class Salary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(25,"Sanju",2,30000));
		employees.add(new Employee(48,"raju",8,80000));
		employees.add(new Employee(39,"zahr",12,100000));
		employees.add(new Employee(54,"luhu",4,50000));
		
//	    Employee e1=new Employee(25,"Sanju",2,30000);
//		Employee e2=new Employee(48,"raju",8,80000);
//		Employee e3=new Employee(39,"zahr",12,100000);
//		Employee e4=new Employee(54,"luhu",4,50000);
//		
//		
//		List<Employee> list=Arrays.asList(e1,e2,e3,e4);		
		
		
		
//		employees.stream()
//        .filter(e -> e.getExp() >=1 && e.getExp()<=2) 
//        .forEach(e -> e.setSalary(e.getSalary()+e.getSalary() * 0.25));
//		
//		
//		employees.stream()
//        .filter(e -> e.getExp() >=3 && e.getExp()<=6) 
//        .forEach(e -> e.setSalary(e.getSalary()+e.getSalary() * 0.05));
//		
//		employees.stream()
//        .filter(e -> e.getExp() >=6 && e.getExp()<=10) 
//        .forEach(e -> e.setSalary(e.getSalary()+e.getSalary() * 0.1));
//		
//		
//		employees.stream()
//        .filter(e -> e.getExp() >=10) 
//        .forEach(e -> e.setSalary(e.getSalary()+e.getSalary() * 0.12));
//		
	
	
		
//		employees.stream()
//        .filter(e -> e.getExp() >=1 && e.getExp()<=2||e.getExp() >=3 && e.getExp()<=6|| e.getExp() >=6 && e.getExp()<=10|| e.getExp() >=10) 
//        .forEach(e -> e.setSalary(e.getSalary()+e.getSalary() * 0.25));
		
		
		List<Employee> lis = employees.stream()
				.peek(t->{
				if(t.getExp() >=1 && t.getExp()<=2)
					t.setSalary(t.getSalary()+0.25*t.getSalary());
				else if(t.getExp() >=3 && t.getExp()<=6)
					t.setSalary(t.getSalary()+0.05*t.getSalary());
				else if(t.getExp() >=6 && t.getExp()<=10)
					t.setSalary(t.getSalary()+0.1*t.getSalary());
				else
					t.setSalary(t.getSalary()+0.12*t.getSalary());
					}
			      ).toList();      
		
//		System.out.println(lis);
		
		employees.forEach(t->System.out.println("Incremented Salary is   : "+t.getSalary()));	

//		employees.forEach(e -> System.out.println("Incremented Salary is     " +e.getSalary()));
    	
	
}
}
	
