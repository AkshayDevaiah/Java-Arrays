package DSAarrays;

import java.util.Scanner;

public class MaximunSubArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a[]=new int[sc.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		int curSum=0,maxSum=0;
		for(int i=0;i<=a.length-1;i++) {
			curSum+=a[i];
			if(curSum>maxSum) {
				maxSum=curSum;
			}
			else if(curSum<maxSum) {
				curSum=0;
			}
		}
		System.out.println("Maximum SubArray is "+maxSum);
		sc.close();
	}

}
