package PlaceElementStartEnd;

import java.util.Scanner;

public class ZeroesOnesWithoutResArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a[]=new int[sc.nextInt()];
		int front=0,end=a.length-1;
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++) {
			int x=sc.nextInt();
			if(x==0) {
				a[front]=x;
				front++;
			}
			else {
				a[end]=x;
				end--;
			}
		}
		System.out.println("Array after storing");
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]+" ");
		}
		sc.close();
	}

}
