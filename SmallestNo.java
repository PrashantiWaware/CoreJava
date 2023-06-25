package EighteenAprilPattern;

public class SmallestNo {

	public static void main(String[] args) {
		int a[]= {4,12,50,7,45,78,1};
		int small=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(small>a[i]) {
				small=a[i];
			}
		}
            System.out.println("Smallest>>"+small);
	}

}
