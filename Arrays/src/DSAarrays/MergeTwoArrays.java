package DSAarrays;

import java.util.Scanner;

public class MergeTwoArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size for first array ");
		int a[]=new int[sc.nextInt()];
		System.out.println("Enter the size for second array");
		int b[]=new int[sc.nextInt()];
		System.out.println("Enter the array elements for first array");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the array elements for second array");
		for(int i=0;i<=b.length-1;i++) {
			b[i]=sc.nextInt();
		}
		int res[]=new int[a.length+b.length];
		int k=0;
		for(int i=0;i<=a.length-1;i++) {
			res[k]=a[i];
			k++;
		}
		for(int i=0;i<=b.length-1;i++) {
			res[k]=b[i];
			k++;
		}
		System.out.println("Resultant array");
		for(int i=0;i<=res.length-1;i++) {
			System.out.println(res[i]+" ");
		}
		sc.close();
	}

}
