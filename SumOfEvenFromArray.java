package TwentysixApril;

public class SumOfEvenFromArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				/*if(sum>0)
				System.out.println(arr[i]);
				else
					System.out.println(arr[i]);*/
				sum=sum+arr[i];
				
			}
			//System.out.println("Sum of Array>>");
			System.out.println(sum);
			
		}

	}

}
