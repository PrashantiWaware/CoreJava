package EighteenAprilPattern;

public class SumOfArray {

	public static void main(String[] args) {
		int a[]= {2,7,8,11,40,20};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
			System.out.println(a[i]);
			sum=sum+a[i];
		}
		System.out.println("sum of array>>>");
		System.out.println(sum);

	}

}
