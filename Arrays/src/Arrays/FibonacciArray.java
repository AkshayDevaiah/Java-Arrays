package Arrays;

import java.util.Scanner;

public class FibonacciArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		a[0]=0;
		a[1]=1;
		for(int i=2;i<=a.length-1;i++) {
			a[i]=a[i-1]+a[i-2];
		}
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
		sc.close();
	}

}
