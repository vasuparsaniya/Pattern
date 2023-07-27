/*--------- 
 * 
 * *
 * * *
 * * * *
 ------------*/
//Using the recursion

package starPattern.pyramid.halfPyramid;

import java.util.Scanner;

public class Case3 {

	static void printRow(int num) {
		if(num==0) {
			return;
		}
		System.out.print("* ");
		printRow(num-1);
	}
	
	static void pattern(int n, int i) {
		if(n == 0) {
			return;
		}
		printRow(i);
		System.out.println("");
		pattern(n-1,i+1);
	}
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number of row:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		pattern(n,1);
	}
}

//Time Complexity: O(n^2)
//Space Complexity: O(N^2)