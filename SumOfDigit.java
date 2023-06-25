package TwentysixApril;

public class SumOfDigit {

	public static void main(String[] args) {
		int n=125;
		int sum=0;
        int cnt=0;
        
        while(n>0) {
        	int r=n%10;
        	sum=sum+r;
        	n=n/10;
        	System.out.println(r);
        	++cnt;
        }
        System.out.println("Sum of Digits>>"+sum);

	}

}
