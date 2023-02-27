/**
 * 
 */
package Factorial;
import java.util.*;

/**
 * @author saman
 *
 */
public class FactorialOfANumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, factorial=1, number;
        System.out.println("Enter the number to which you need to find the factorial:");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        for(i = 1; i<=number; i++) {
           factorial = factorial * i;
        }
        System.out.println("Factorial of the given number is:: "+factorial);


	}

}
