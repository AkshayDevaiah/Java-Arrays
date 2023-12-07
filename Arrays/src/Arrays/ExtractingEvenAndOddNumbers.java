package Arrays;

import java.util.Scanner;

public class ExtractingEvenAndOddNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a[]=new int[sc.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Even Numbers are");
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		System.out.println("odd Numbers are");
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2!=0) {
				System.out.print(a[i]+" ");
			}
		}
		sc.close();
	}

}
