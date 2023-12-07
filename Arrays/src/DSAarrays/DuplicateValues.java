package DSAarrays;

import java.util.Scanner;

public class DuplicateValues {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a[]=new int[sc.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		int flag=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]==a[j]) {
					System.out.println("Found duplicates which is number "+ a[i]);
					flag=1;
				}
			}
		}
		if(flag==0) {
			System.out.println("No duplicates found");
		}
		sc.close();
	}

}
