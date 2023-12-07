package Arrays;

import java.util.Scanner;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a[]=new int[sc.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		
		int count=0;
		int max=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]==1) {
				count++;
			}
			else {
				count=0;
			}
			max=Math.max(count, max);
		}
		System.out.println("Maximum consecutive ones in the given array is"+max);
		sc.close();
	}

}
