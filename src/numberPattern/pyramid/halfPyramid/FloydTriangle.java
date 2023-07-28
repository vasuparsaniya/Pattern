package numberPattern.pyramid.halfPyramid;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		int row,number=1;
		System.out.println("Enter the number of Row:");
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(number+" ");
				++number;
			}
			System.out.println();
		}
	}

}
