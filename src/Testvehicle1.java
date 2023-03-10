/**
 * 
 */
package ustbatchno3.junit5testcases;

/**
 * @author Administrator
 *
 */


	import static org.junit.Assert.assertEquals;

	import java.util.Arrays;
	import java.util.List;
	import org.junit.Test;
	public class Testvehicle1 {
	
		@Test
		 public void test() {
			List<String> expected=Arrays.asList("Tamilnadu","KALLAR");
			String no="TN05BM6767";
			List<String> actual1=Vehicle1.sdataset(no);
			System.out.println(actual1);
			 assertEquals(expected,actual1);
			
		}

	}



