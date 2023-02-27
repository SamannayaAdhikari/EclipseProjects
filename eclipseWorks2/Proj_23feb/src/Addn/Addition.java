/**
 * 
 */
package Addn;
import java.util.*;

/**
 * @author saman
 *
 */
public class Addition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y,z;
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Enter the first no. ");
			x = sc.nextInt();
			System.out.println("Enter the 2nd no.: ");
			y= sc.nextInt();
		}
		z= x+y;
		System.out.println("Sum is "+ z);
	
	}

}
