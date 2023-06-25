package EighteenAprilPattern;

public class PrimeNoOnetoHundred {

	public static void main(String[] args) {
		
		String primeNumbers="";
		for(int i=1;i<=100;i++) {
			int cnt=0;
			for(int n=i;n>=1;n--) {
				if(i%n==0) 
					cnt++;
				
			}
			if(cnt==2) {
				primeNumbers=primeNumbers+i+" ";
			}
		}
         System.out.println("Prime Numbers are>>");
         System.out.print("\n"+primeNumbers);
	}

}
