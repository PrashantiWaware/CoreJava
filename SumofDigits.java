package ThirtyOne;

public class SumofDigits {
	public static void main(String[]args) {
		
	
	int n=567;
	int sum=0;
	int count=0;
	
	while(n>0) {
		int r=n%10;
		sum=sum+r;
		n=n/10;
		System.out.println(r);
		++count;
		
		
	}
	
	System.out.println("Sum>>"+sum);
	//System.out.println("Number of digits: "+count);
	}
	
	

}
