/*-------
        1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
--------*/

package numberPattern.pyramid.fullPyramid;

import java.util.Scanner;

public class Case1 {

	public static void main(String[] args) {
		int row,k=0,count=0,count1=0;
		System.out.println("Enter the number od Row:");
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		
		for(int i=1;i<=row;i++) {
			for(int space=1;space<=row-i;++space) {
				System.out.print(" ");
				++count;
			}
			while(k != 2*i-1) {
				if(count<=row-1) {
					System.out.print((i+k)+" ");
					++count;
				}else {
					++count1;
					System.out.print((i+k-2*count1)+" ");
				}
				++k;
			}
			count1=count=k=0;
			System.out.println();
		}
	}
}