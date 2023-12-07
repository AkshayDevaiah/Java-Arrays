//Maximum difference btw largest and smallest element
//Note that smallest element should come first

package Arrays;

import java.util.Scanner;

public class MaxDiffBtwTargetAndMinElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a[]=new int[sc.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		int max=0;
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]<a[j]) {
					max=Math.max(max,a[j]-a[i]);
				}
			}
		}
		
		System.out.println("MAximum difference is "+max);
		sc.close();
	}

}
