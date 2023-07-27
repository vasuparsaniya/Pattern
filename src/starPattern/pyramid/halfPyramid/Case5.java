/*----------
           * 
         * * 
       * * * 
     * * * * 
   * * * * * 
-----------*/
//After rotation of 180 degree
//using recursion

package starPattern.pyramid.halfPyramid;

import java.util.Scanner;

public class Case5 {

	static void printSpace(int space) {
		if(space == 0) {
			return;
		}
		System.out.print(" "+" ");
		printSpace(space-1);
	}
	
	static void printStars(int star) {
		if(star == 0) {
			return;
		}
		System.out.print("* ");
		printStars(star-1);
	}
	
	static void pattern(int n, int num) {
		if(n == 0) {
			return;
		}
		printSpace(n-1);
		printStars(num-n+1);
		System.out.println();
		pattern(n-1,num);
	}
	
	public static void main(String[] args) {
		int row;
		System.out.println("Enter the number of Row:");
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		
		pattern(row,row);
	}
}
