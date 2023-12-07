package DSAarrays;

import java.util.Scanner;

public class RightRotateArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a[]=new int[sc.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the k value to rotate");
		int k=sc.nextInt();
		int i=0;
		while(k>0) {
			int temp=a[a.length-1];
			for(i=a.length-1;i>0;i--) {
				a[i]=a[i-1];
			}
			a[i]=temp;
			k--;
		}
		System.out.println("Array after rotating");
		for(i=0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
		sc.close();

	}

}
