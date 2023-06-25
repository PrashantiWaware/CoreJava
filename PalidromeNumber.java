package AprilThird;

public class PalidromeNumber {

	public static void main(String[] args) {
		int r,sum=0,t;
		int n=121;
		t=n;
		
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(t==sum)
			System.out.println(sum+" is Palidrome number");
		else
			System.out.println(" not palidrome number");

	}

}
