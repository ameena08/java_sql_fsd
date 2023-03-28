package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Testoddeven {

		@Test
		public void testEven() {
			int number=10;
			
			boolean result=isEven(number);
			assertTrue(result);
					

		}
		@Test
		public void testOdd() {
			int number=3;
			
			boolean result=isEven(number);
			assertFalse(result);
			
		}

		public boolean isEven(int number) {
			return number%2==0;
		}
}