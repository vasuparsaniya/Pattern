/*-------
     1 
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1 
1 5 10 10 5 1
 --------*/
//PascalTriangle
package numberPattern.pyramid.fullPyramid;

import java.util.Scanner;

public class pascalTriangle {

	public static void main(String[] args) {
		int row,coef=1;
		System.out.println("Enter the number of Row:");
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		
		for(int i=0;i<row;i++) {
			for(int space=1;space<row-i;++space) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				if(j==0 || i==0) {
					coef=1;
				}else {
					coef=coef*(i-j+1)/j;
				}
				System.out.print(coef+" ");
			}
			System.out.println();
		}
	}
}
