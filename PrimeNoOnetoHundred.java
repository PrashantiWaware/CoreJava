package MarchTwentyOne_FORLOOP;

public class PrimeNoOnetoHundred {

	public static void main(String[] args) {
		for(int k=1;k<=100;k++) {
			int cnt=0;
			int n=k;
			for(int i=1;i<=n;i++) {
				if(n%i==0) 
					cnt++;
					}
			if(cnt==2) {
				System.out.println(n);
			}
			
		}

	}

}
