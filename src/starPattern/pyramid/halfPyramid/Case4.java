/*----------
           * 
         * * 
       * * * 
     * * * * 
   * * * * * 
-----------*/
//After rotation of 180 degree
//using for loop

package starPattern.pyramid.halfPyramid;

import java.util.Scanner;

public class Case4 {

	public static void printStars(int n) {
		int i,j;
		
		//outer for loop handle number of rows
		for(i=0;i<n;i++) {
			//inner for loop handle space
			for(j=2*(n-i);j>=0;j--) {
				System.out.print(" ");
			}
			//handle number of column
			for(j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number of Row:");
		Scanner sc=new Scanner(System.in);
		num = sc.nextInt();
		
		printStars(num);
		
	}
}

//Time Complexity: O(n^2)
//Space Complexity: O(1)
