package AprilThird;

public class PrimeNofromOnetoHundred {

	public static void main(String[] args) {
		String Primenumbers=" ";
		for(int i=1;i<=100;i++) {
			int cnt=0;
			for(int n=i;n>=1;n--) {
				if(i%n==0)
					cnt++;
			}
			
			if(cnt==2) {
				Primenumbers=Primenumbers+i+" ";
			}
		}
		System.out.println("Primenumbers are>>");
		System.out.println(Primenumbers);

	}

}
