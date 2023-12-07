package DSAarrays;

import java.util.Scanner;

public class ReverseArrayInGroups {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a[]=new int[sc.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the k value for grouping");
		int k=sc.nextInt();
		int temp;
		for(int i=0;i<=a.length-1;i=i+k) {
			int start=i;
			int end=Math.min(i+k-1, a.length-1);
			while(start<end) {
				temp=a[start];
				a[start]=a[end];
				a[end]=temp;
				start++;
				end--;
			}
		}
		System.out.println("Array after reversing");
		for( int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]+" ");
		}
		sc.close();
	}

}
