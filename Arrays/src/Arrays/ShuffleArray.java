
//Shuffle an array such that index i,mid,i+1,mid+1,i+2...comes together

package Arrays;

import java.util.Scanner;

public class ShuffleArray {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of an array(even size)");
			int a[]=new int[sc.nextInt()];
			System.out.println("Enter the array elements");
			for(int i=0;i<=a.length-1;i++) {
				a[i]=sc.nextInt();
			}
			int res[]=new int[a.length];
			int mid=(a.length/2);
			for(int i=0;i<=mid;i++) {
				res[2*i]=a[i];
				res[2*i+1]=a[i+mid];
			}
			System.out.println("Shuffled array is");
			for(int i=0;i<=res.length-1;i++) {
				System.out.print(res[i]+" ");
			}
			sc.close();
	}

}
