package MarchTwentyOne_FORLOOP;

public class SumOfOdd {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				sum=sum+i;
				System.out.println(i);
			}
		}
		System.out.println("Sum of ODD>> "+sum);

	}

}
