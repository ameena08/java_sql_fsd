 package hashmap;

/**
 * @author Administrator
 *
 */
public class Employee {
	
	private int Id;
	public String name;
	public int age;
	public String department;
	
	
	public Employee(int id, String name, String department, int age) {
		super();
		this.Id = id;
		this.name = name;
		this.age = age;
		this.department = department;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
	
	
	
	
	
	
