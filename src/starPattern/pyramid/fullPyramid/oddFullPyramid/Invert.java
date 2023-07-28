package starPattern.pyramid.fullPyramid.oddFullPyramid;

import java.util.Scanner;

public class Invert {

	public static void main(String[] args) {
		int row;
		
		System.out.println("Enter the number of Row:");
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		
		for(int i=row;i>=1;--i) {
			for(int space=1; space<=row - i; ++space) {
				System.out.print(" ");
			}
			for(int j=i;j<=2*i-1;++j) {
				System.out.print("* ");
			}
			for(int j=0;j<i-1;++j) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
