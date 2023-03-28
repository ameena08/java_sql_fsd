/**
 * 
 */
package practice;

/**
 * @author Administrator
 *
 */
public class Anagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Listen";
		String st="Silent";
		
		if(str.length()!=st.length()) {
			System.out.println("It is not an anagram");
		}
		else {
			
			char ch=str.charAt(0);
			for( i=0;i<str.length();i++) {
//				char ch=str.charAt(i);
				
				for(int j=0;j<st.length();j++) {
					
					if(str.charAt(i)==st.charAt(j)&&str.charAt(j)!=ch) {
						System.out.println("It is anagram");
				}
				
					
				}
				
			}
		}


	}
}

	


