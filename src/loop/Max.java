/**
 * 
 */
package loop;

/**
 * @author Administrator
 *
 */
public class Max {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {5,3,8,1,7,2};
		int max=array[0];
	
		
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
				System.out.println("Maximum is  :  "  +max);	
				
				
			}
			
			}
		
		}
}
		

	


