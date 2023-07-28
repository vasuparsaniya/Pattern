/*----------
     * 
    * * * 
   * * * * * 
  * * * * * * * 
 * * * * * * * * * 
* * * * * * * * * * * 
------------*/

package starPattern.pyramid.fullPyramid.oddFullPyramid;

import java.util.Scanner;

public class Case1 {

	public static void main(String[] args) {
		
		int row, k=0;
		
		System.out.println("Enter the number of Rows:");
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		
		for(int i=1;i<=row;++i,k=0) {
			for(int space=1;space<=row-i;++space) {
				System.out.print(" ");
			}
			
			while(k != 2*i-1) {
				System.out.print("* ");
				++k;
			}
			System.out.println("");
		}	
	}
}
