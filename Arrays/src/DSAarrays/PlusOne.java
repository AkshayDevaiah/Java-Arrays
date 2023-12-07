//if {1,2,4} is given as array result should be {1,2,5}
//{1,2,9}=={1,3,0}
//{9,9,9}=={1,0,0,0}


package DSAarrays;

import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {
	public static int[] plusOne(int a[]) {
		int i=a.length-1;
		int res[]=new int[a.length+1];
		while(i>=0) {
			if(a[i]!=9) {
				a[i]=a[i]+1;
				return a;
			}
			else {
				a[i]=0;
				i--;
			}
			res[0]=1;
			return res;
		}
		return res;
	
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a1[]=new int[sc.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a1.length-1;i++) {
			a1[i]=sc.nextInt();
		}
		plusOne(a1);
		System.out.println(Arrays.toString(a1));
		sc.close();
	}
}
