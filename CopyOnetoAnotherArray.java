package EighteenAprilPattern;

public class CopyOnetoAnotherArray {

	public static void main(String[] args) {
		int a[]= {2,5,8,11,14,17};
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}

	}

}
