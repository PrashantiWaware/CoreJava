package TwentysixApril;

public class SumOfArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			sum=sum+a[i];
		}
		System.out.println("Sum of Array>>");
		System.out.println(sum);

	}

}
