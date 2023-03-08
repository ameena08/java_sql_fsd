/**
 * 
 */
package loop;

/**
 * @author Administrator
 *
 */
public class Positive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {4,-4,6,8,-9,0,4,-7,56};
		int count=0;
		int count1=0;
		
		
		for(int i=0;i<array.length;i++)
			if(array[i]>0) {
				count= count+1;
			}
			else if(array[i]<0){
				count1= count1+1;
				
				
			}
				
			else {
				System.out.println("0 is neutral        " );
					
				
			}
		System.out.println("Positive count is  :   "  +count);
		System.out.println("Negative count is   :  "  +count1);
		


				

	}

}
