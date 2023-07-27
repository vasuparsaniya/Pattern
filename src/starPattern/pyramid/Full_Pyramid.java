package starPattern.pyramid;

import java.util.Scanner;

public class Full_Pyramid {

	public static void main(String[] args) {
		int i,j,k=0,row;
		System.out.println("Enter the number of row:");
		Scanner r=new Scanner(System.in);
		row=r.nextInt();
		
		for(i=1;i<=row;++i,k=0) {
			for(j=1;j<=row-1;j++) {
				System.out.print(" ");  //space
			}
			
			while(k!=2*i-1) {
				System.out.print("* ");
				++k;
			}
			System.out.println("");
		}
	}
}
