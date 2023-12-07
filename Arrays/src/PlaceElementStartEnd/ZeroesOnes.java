package PlaceElementStartEnd;

import java.util.Scanner;

public class ZeroesOnes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a[]=new int[sc.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		int res[]=new int[a.length];
		int j=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]==0) {
				res[j]=a[i];
				j++;
			}
		}
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]!=0) {
				res[j]=a[i];
				j++;
			}
		}
		System.out.println("Resultant array");
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(res[i]+" ");
		}
		sc.close();

	}

	}
