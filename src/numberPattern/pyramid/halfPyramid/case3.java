package numberPattern.pyramid.halfPyramid;

import java.util.Scanner;

public class case3 {

	public static void main(String[] args) {
		int row,r=1,c=1;
		System.out.println("Enter the number of Row:");
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		
		while(r<=row) {
			while(c<=r) {
				System.out.print(c+" ");
				c++;
			}
			r++;
			c=1;
			System.out.println();
		}
	}
}
