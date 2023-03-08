package hashmap;

import java.util.HashMap;

/**
 * @author Administrator
 *
 */


public class Codehash {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Employee> map = new HashMap<>();
			map.put(1,new Employee(100,"Ameena","abc",22));
			map.put(2,new Employee(101,"Aysha","def",22));
			map.put(3,new Employee(102,"Aiswarya","hij",24));
			map.put(4,new Employee(103,"Haritha","klm",23));
		
		Employee age = map.get(1);
		System.out.println("Age of Ameena  : "+age);
		
		
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		System.out.println(map.get(4));
		
		
		
	}

}


