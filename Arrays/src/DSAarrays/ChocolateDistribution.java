//Array consists of n positive numbers
//there are m students,each should get atleast one packet
//one pack can have variable number of chocolates
//Difference btw students having maximum number of chocolates and minimum should be minimum

package DSAarrays;

import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistribution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a[]=new int[sc.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter number of students");
		int m=sc.nextInt();
		
		Arrays.sort(a);
		int min=Integer.MAX_VALUE;
		int mid=(a[0]+a[a.length-1])/2;
		for(int i=0;i+m-1<=mid;i++) {
			int diff=a[i+mid+1]-a[i];
			if(diff<min) {
				min=diff;
			}
		}
		System.out.println("Minimum difference is "+min);
		sc.close();
	}

}
