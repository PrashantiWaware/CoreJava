package NineteenAprilPattern;

public class AscOrderArray {

	public static void main(String[] args) {
		int a[]= {11,-8,13,7,4};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		
        System.out.println("\n Smallest>>"+a[0]);
        System.out.println("2nd  Smallest>>"+a[1]);
        System.out.println("Largest >>"+a[a.length-1]);
        System.out.println("2nd Largest >>"+a[a.length-2]);
	}

}
