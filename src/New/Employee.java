/**Given employee table with attributes employee Id of type String,Employee name of type String, Double salary.
Sort the employees based on the salaries.
	Condition : if Sal>50,000 then 10% increment of previous salary.
		    if Sal<1,00,000 then 5% increment of previous salary.
Find employee name and Current salary after increment.
      (Hint: Use comparable Comporator Interface) **/



/**
 * 
 */
package New;

/**
 * @author Administrator
 *
 */

	import java.util.Arrays;
	import java.util.Comparator;
	import java.util.List;


	public class Employee {

		public static void main(String[] args) {
			Main m1=new Main(133, "Sanu", 200000);
			Main m2=new Main(193, "Manu", 2000);
			Main m3=new Main(121, "Fanu", 70000);
			List<Main> list=Arrays.asList(m1,m2,m3);
			List<Main> lis = list.stream().sorted(Comparator.comparing(Main::getSalary).reversed())
					.peek(k->{
					if((k.getSalary()>=50000)&&(k.getSalary()<100000))
						k.setSalary(k.getSalary()+(0.1)*k.getSalary());
					else if(k.getSalary()>=100000)
						k.setSalary(k.getSalary()+(0.05)*k.getSalary());}
				      ).toList();
					
			
						 
			System.out.println(lis);
			
		}

	}
