package AprilEleventh_TEST;

public class Sum_Of_ODD {

	public static void main(String[] args) {
		int sum=0;
		for(int i=10;i>=1;i--) {
			if(i%2!=0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);

	}

}
