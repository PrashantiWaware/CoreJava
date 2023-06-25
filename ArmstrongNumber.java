package AprilThird;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n=407;
		int sum=0,t=n,r;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+(r*r*r);
		}
		n=t;
		if(n==sum) 
			System.out.println(n+" is Armstrong no.");
		else
			System.out.println(n+" is not Armstrong");
		
		System.out.println("Sum>>"+sum);
			
		

	}

}
