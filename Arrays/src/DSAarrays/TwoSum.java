package DSAarrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a[]=new int[sc.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the target element");
		int target=sc.nextInt();
		int res[]=new int[2];
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<=a.length-1;i++) {
			if(map.containsKey(target-a[i])){
				res[1]=i;
				res[0]=map.get(target-a[i]);
				//to get value instead of indexes
//				res[0]=target-a[i];
//				res[1]=a[i];
			}
			map.put(a[i], 1);
		}
		System.out.println("Result of the match is");
		for(int i=0;i<=res.length-1;i++) {
			System.out.print(res[i]+" ");
		}
		sc.close();
	}

}
