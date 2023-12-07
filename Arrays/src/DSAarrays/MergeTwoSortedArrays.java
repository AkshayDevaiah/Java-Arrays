package DSAarrays;

import java.util.Scanner;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size for first array ");
		int a[]=new int[sc.nextInt()];
		System.out.println("Enter the size for second array");
		int b[]=new int[sc.nextInt()];
		System.out.println("Enter the sorted array elements for first array");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the sorted array elements for second array");
		for(int i=0;i<=b.length-1;i++) {
			b[i]=sc.nextInt();
		}
		int res[]=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				res[k]=a[i];
				k++;
				i++;
			}
			else {
				res[k]=b[j];
				k++;
				j++;
			}
		}
		while(i<a.length) {
			res[k]=a[i];
			k++;
			i++;
		}
		while(j<b.length) {
			res[k]=b[j];
			k++;
			j++;
		}
		System.out.println("Resultant array");
		for( i=0;i<=res.length-1;i++) {
			System.out.println(res[i]+" ");
		}
	sc.close();
	}

}
