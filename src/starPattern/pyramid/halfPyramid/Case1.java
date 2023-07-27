/*--------- 
 * 
 * *
 * * *
 * * * *
 ------------*/
//Using the for loop

package starPattern.pyramid.halfPyramid;

import java.util.Scanner;

public class Case1 {

	public static void main(String[] args) {
		int i, j, row;
		System.out.println("Enter the number of Row:");
		Scanner r=new Scanner(System.in);
		row=r.nextInt();
		
		for(i=1;i<=row;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}

//Time Complexity: O(n^2)
//Space Complexity: O(1)
