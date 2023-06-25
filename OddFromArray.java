package EighteenAprilPattern;

public class OddFromArray {

	public static void main(String[] args) {
		int arr[]= {9,6,5,9,4,38,10,11};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
		}

	}

}
