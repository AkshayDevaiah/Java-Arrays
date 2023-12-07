package DSAarrays;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a[]=new int[sc.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		int i=0,j=a.length-1,temp=0;
		while(i<j) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;	
		}
		System.out.println("Array after reversing");
		for(i=0;i<=a.length-1;i++) {
			System.out.println(a[i]+" ");
		}
		sc.close();
	}

}
