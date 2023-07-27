/*----------
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
-----------*/
//using for loop

package starPattern.pyramid.fullPyramid;

import java.util.Scanner;

public class Case1 {
	
	public static void printTiangle(int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=(n-i);j>1;j--) {
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int row;
		
		System.out.println("Enter the number of Row:");
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		
		printTiangle(row);
	}
}