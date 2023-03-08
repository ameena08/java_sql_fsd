/**
 * 
 */
package string;

/**
 * @author Administrator
 *
 */
public class EmployeeIncrement {
	public static Employee[]salaryIncrement(Employee[] empArr){
		for(int i=0;i<empArr.length;i++) {
			if(empArr[i].getSalary()>100000) {
				double increment=(5.0 /100.0)*empArr[i].getSalary();
				empArr[i].setSalary(increment+empArr[i].getSalary());
			}
			else if(empArr[i].getSalary()>50000){
				double increment=( 10.0/100.0)*empArr[i].getSalary();
				
				empArr[i].setSalary(increment + empArr[i].getSalary());			
					
				}			
			}
		return empArr;
		}
	}


