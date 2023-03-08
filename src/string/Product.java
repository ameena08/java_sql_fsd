/**
 * 
 */
package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Administrator
 *
 */
public class Product {
	
	int id;
	String name;
	private Float price;
	

	public Product(String name, int id, float price) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.price=price;
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> n= new ArrayList<Product>();
		n.add(new Product("Egg",100,10000));
		n.add(new Product("Banana",100,20000));
		n.add(new Product("Bread",100,30000));
		n.add(new Product("Chocolate",100,2000));
		
		List<Float> p2= n.stream().filter(p->p.price>10000).map(p->p.price).collect(Collectors.toList());
		
		System.out.println(p2);

	}

}