/**
 * 
 */
package hashmap;

import java.util.HashMap;

/**
 * @author Administrator
 *
 */
public class Age {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> map=new HashMap<>();
		map.put("Ameena",22);
		map.put("Aysha",22);
		map.put("Haritha",23);
		map.put("Aiswarya",24);
		
		int age=map.get("Ameena");
		System.out.println("Age of Ameena is  :  "+age);
		
		boolean a=map.containsKey("Aysha");
		System.out.println("Map contains Aysha  :  "+a);
		
		
		boolean b=map.containsKey("Fathima");
		System.out.println("Map contains Fathima :  "+b);
		
		
		for(String name:map.keySet())  {
			int value=map.get(name);
			System.out.println(name+ "  is  " +value + "  years ");
		}
		
		
		
		
		
		
	}

}