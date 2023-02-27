/**
 * 
 */
package Transpose;

import java.io.*;
import java.util.*;


/**
 * @author saman
 *
 */
public class TransposeOfaMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= new int[3][2];
		int i,j;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the 6 elements ");
		
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[j].length;j++) {
				arr[i][j]= sc.nextInt();
				
			}
		}
		
		System.out.println("The Matrix is : ");
		
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[j].length;j++) {
				System.out.print(" "+arr[i][j]);
				
			}
			System.out.println(" ");
		}
		
		System.out.println("The Transpose is : ");
		for(i=0; i<arr[i].length; i++) {
			for(j=0; j<arr.length;j++) {
				System.out.print(" "+arr[j][i]);
				
			}
			System.out.println(" ");
		}

	}

}
