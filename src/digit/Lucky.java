/**
 * 
 */
package digit;

/**
 * @author Administrator
 *
 */
import java.util.Scanner;
public class Lucky {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a 4 digit number  :   ");
		int n=s.nextInt();
		int flag=0;
		int flag1=0;
		int flag2=0;
		int digit=0;
		
		
		while(n>0)
		{
			digit=n%10;
			if(digit==3)
				flag=1;
			else if(digit==6)
			
				flag1=1;
			else if(digit==9)
				flag2=1;
		n=n/10;	
		}
	
		if(flag==1&&flag1==1&&flag2==1) {
			System.out.println("Lucky number");
		}
		else
			System.out.println("Not a Lucky number");
			
				
		}
	}



