package DSAarrays;

import java.util.Scanner;

public class DeleteFromLocation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a[]=new int[sc.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the location from which you want to delete");
		int loc=sc.nextInt();
		
		for(int i=loc;i<=a.length-2;i++) {
			a[i]=a[i+1];
		}
		
		System.out.println("Array after deleting");
		for( int i=0;i<=a.length-2;i++) {
			System.out.println(a[i]+" ");
		}
		sc.close();
	}

}
