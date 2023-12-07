package Arrays;

import java.util.Scanner;

public class SumOfArrayValues {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a[]=new int[sc.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			sum+=a[i];
		}
		System.out.println("Sum of the given array is"+sum);
		sc.close();

	}

}
