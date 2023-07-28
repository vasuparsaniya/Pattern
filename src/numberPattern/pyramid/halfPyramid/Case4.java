/*---------
       1 
     2 3 
   4 5 6 
----------*/
//Rotate 180 degree Floyd Triangle
package numberPattern.pyramid.halfPyramid;

import java.util.Scanner;

public class Case4 {

	public static void main(String[] args) {
		int row,number=1;
		System.out.println("Enter the number of Row:");
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		
		for(int i=0;i<row;i++) {
			for(int j=2*(row-i);j>=0;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print(number+" ");
				++number;
			}
			System.out.println();
		}
		
	}

}
