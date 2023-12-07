package DSAarrays;

import java.util.Scanner;

public class DeleteSpecificElement {

	public static void main(String[] args) {
		Del d=new Del();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a[]=new int[sc.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the array element to delete");
		int x=sc.nextInt();
		int c=d.del(a,x);
		if(c==0) {
			System.out.println("Element not present the array");
		}
		else {
			System.out.println("Array after deleting");
			for( int i=0;i<=(a.length-1-c);i++) {
				System.out.println(a[i]+" ");
			}
		}
		sc.close();
	}

}
class Del{
	public int del(int[] a,int x) {
		int count=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]==x) {
				for(int j=i;j<=a.length-2;j++) {
				a[j]=a[j+1];
				}
				count++;
				i--;
			}
		}
		return count;
	}
}