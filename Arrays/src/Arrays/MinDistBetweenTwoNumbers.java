package Arrays;

public class MinDistBetweenTwoNumbers {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int x=10;
		int y=30;
		MinDist m=new MinDist();
		int mini=m.min(a,x,y);
		System.out.println("Min distance is");
		System.out.println(mini);
	}
}

class MinDist{
	public int min(int[] a,int x,int y) {
		int min_dist = 0;
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
				if(((x==a[i]&&y==a[j]) || (y==a[i]&&x==a[j])) && min_dist > Math.abs(i-j)) {
						min_dist=Math.abs(i-j);
				}
			}
		}
		return min_dist;
	}
}
