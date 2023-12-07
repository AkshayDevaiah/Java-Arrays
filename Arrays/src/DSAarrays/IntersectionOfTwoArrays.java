package DSAarrays;

import java.util.Scanner;

public class IntersectionOfTwoArrays {

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
		System.out.println("Common elements are");
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=b.length-1;j++) {
				if(a[i]==b[j]) {
					System.out.print(a[i]+" ");
				}
			}
		}
		sc.close();
	}

}
