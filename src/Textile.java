/**
 * 
 */
package ustbatchno3.junit5testcases;

/**
 * @author Administrator
 *
 */

	import java.time.LocalDate;
	import java.util.List;

	public class Textile {

		

		public static long countgarments(List<String> items, LocalDate dateBefore) {
			// TODO Auto-generated method stub
			return items.stream().count();
		}

		public static long countprice(List<Integer> price, LocalDate dateBefore) {
			return price.stream().mapToInt(Integer::intValue).sum();
		}

		public static String check(List<String> items) {
			// TODO Auto-generated method stub
			return null;
		};
		}



