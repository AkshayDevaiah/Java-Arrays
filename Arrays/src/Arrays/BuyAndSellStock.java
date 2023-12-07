//note that you cant sell before buying
//buy at min sell at max

package Arrays;

import java.util.Scanner;

public class BuyAndSellStock {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a[]=new int[sc.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		Buy b=new Buy();
		int m=b.buy(a);
		System.out.println("MAximum profit made "+m);
		sc.close();
	}
}
class Buy{
		public  int buy(int[] a) {
			int min=Integer.MAX_VALUE;
			int max=0;
			for(int i=0;i<=a.length-1;i++) {
				
				//buy code
				if(a[i]<min) {
					min=a[i];
				}
				
				//sell code
				if((a[i]-min)>max) {
					max=a[i]-min;
				}
			}
			return max;
		}
}


