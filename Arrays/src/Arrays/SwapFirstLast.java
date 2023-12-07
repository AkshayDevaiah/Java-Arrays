package Arrays;

import java.util.Scanner;

public class SwapFirstLast {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a[]=new int[sc.nextInt()];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Array before swapping");
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]+" ");
		}
		
		a[0]+=a[a.length-1];
		a[a.length-1]=a[0]-a[a.length-1];
		a[0]=a[0]-a[a.length-1];
		
		System.out.println("Array after swapping");
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]+" ");
		}
		
		sc.close();
	}

}


