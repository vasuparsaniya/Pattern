/*--------- 
 * 
 * *
 * * *
 * * * *
 ------------*/
//Using the while loop

package starPattern.pyramid.halfPyramid;

import java.util.Scanner;

public class Case2 {

	public static void main(String[] args) {
		
		int r=1, c=0, row;  //r-->current row, row-->number of row, c-->column
		System.out.println("Enter the number of rows:");
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		
		while(r<=row) {
			while(c<=r-1){  //Initial c=1 then while(c<=r)
				System.out.print("* ");
				c++;
			}
			r++;
			c=0;
			System.out.println("");
		}
	}
}

//Time Complexity: O(n^2)
//Space Complexity: O(1)

//Time Complexity: O(n^2)
//Space Complexity: O(1)