package ThirtyOne;

public class ReversetoSame {

	public static void main(String[] args) {
		int n=125;
		int rev=0,r,t=n;
		while(n>0) {
			r=n%10;
			n=n/10;
			rev=(rev*10)+r;
			
		}
		n=rev;
		while(n>0) {
			r=n%10;
			n=n/10;
			System.out.println(r);
		}
	}

}
