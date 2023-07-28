/*--------------
     1 
    2 3 
   4 5 6 
  7 8 9 10 
 11 12 13 14 15 
16 17 18 19 20 21 
-------------*/
package numberPattern.pyramid.halfPyramid;

import java.util.Scanner;

public class Case5 {

	public static void main(String[] args) {
		int row,number=1;
		System.out.println("Enter the number of Row:");
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		
		for(int i=0;i<row;i++) {
			for(int space=row-i;space>1;space--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(number+" ");
				++number;
			}
			System.out.println();
		}
//		for(int i=1;i<=row;i++) {
//			for(int space=1;space<row-i;++space) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print(number+" ");
//				++number;
//			}
//			System.out.println();
//		}
	}
}
