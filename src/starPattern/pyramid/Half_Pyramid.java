package starPattern.pyramid;

import java.util.Scanner;

public class Half_Pyramid {
	
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
