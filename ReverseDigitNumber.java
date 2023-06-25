package AprilThird;

public class ReverseDigitNumber {

	public static void main(String[] args) {
		int n=567;
		int rev=0,r,t=n;
		while(n>0) {
			r=n%10;
			n=n/10;
			rev=(rev*10)+r;
			//System.out.println("Reverse>>"+rev);
		}
		System.out.println("Reverse>>"+rev);
	}

}
