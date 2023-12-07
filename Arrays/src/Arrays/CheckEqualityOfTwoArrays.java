package Arrays;

import java.util.Scanner;

public class CheckEqualityOfTwoArrays {

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
		int flag=0;
		if(a.length!=b.length) {
			flag=1;
		}
		else {
			for(int i=0;i<=a.length-1;i++) {
					if(a[i]!=b[i]) {
						flag=1;
						break;
					}
				}
			}
		
		if(flag==0)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");
		sc.close();
	}

}
