package EighteenAprilPattern;

public class LargestNo {

	public static void main(String[] args) {
		int a[]= {4,2,0,36,89,188};
		int small=a[0];
		for(int i=0;i<a.length;i++) {
			if(small<a[i]) {
				small=a[i];
			}
			
		}
            System.out.println("Largest>>"+small);
	}

}
