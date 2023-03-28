/**
 * 
 */
package ustbatchno3.junit5testcases;

/**
 * @author Administrator
 *
 */

public class Vowel{
	
public static int vowelscount(String input) {
	String str = input;
	int len=str.length();
	int count=0;
	for(int i=0;i<len;i++)
	{
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'
				||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
		{
			count++;
		}
		
	}
	System.out.println("Vowels  :  "+count);
	return count;

}

}


