package NineteenAprilPattern;

public class SquareOfWhome {

	public static void main(String[] args) {
		int a[]= {2,3,5,6,50};
		int b[]= {23,4,25,66,9,100,33,677};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]*a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}

	}

}
