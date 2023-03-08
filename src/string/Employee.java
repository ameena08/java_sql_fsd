/**
 * 
 */
package string;

import java.util.Comparator;

/**
 * @author Administrator
 *
 */
public class Employee implements Comparable<Employee> {
    private String name;
    private String id;
    private  double salary;
	public Employee(String name, String id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return"[id=" +this.id+",name=" +this.name+ ",salary="+this.salary+ "]";
	}
	
	
	public int compareTo(Employee emp) {
		
		return 0;
	}
	
	
	public static Comparator<Employee>SalaryComparator=new Comparator<Employee>() {
		
		public int compare(Employee e1,Employee e2) {
			return(int)(e1.getSalary()-e2.getSalary());
		}
	};
		

}
