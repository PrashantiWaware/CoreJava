package AprilThird;

public class PrimeNoOrNOt {

	public static void main(String[] args) {
		
		int n=17;
		int cnt=0;
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) 
				cnt++;
				
			
		}
		if(cnt==2) {
			System.out.println(n+" is prime no.");
		}else {
			System.out.println(n+" is not prime no.");
		}
	}

}
