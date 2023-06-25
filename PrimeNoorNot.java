package TwentysixApril;

public class PrimeNoorNot {

	public static void main(String[] args) {
		int n=11;
		int cnt=0;
		boolean flag=false;
		for(int i=2;i<=n/2;i++) {
			if( n%i==0) { //condition for non prime no.1
			flag=true;
			break;
		}
		}
		
		if(!flag) 
			System.out.println(n+" is prime no.");
		else
			System.out.println(n+" is not prime no.");

	}

}
