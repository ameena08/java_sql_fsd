package ustbatchno3.junit5testcases;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Testvowels {

	@Test
	public void testvowels() {
		String input="Hello";
		int expected=2;
		int actual=Vowel.vowelscount(input);
		assertEquals(expected,actual);
			
}
}
