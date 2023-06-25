package MarchTwentyFour_SWAPMETHOD;

public class SwappingOfTWO {

	public static void main(String[] args) {
		
		
		int a=10,b=20,t;
		
		//Using third variable
		System.out.println("Before swapping>> ");
		System.out.println("a>> "+a+" b>> "+b);
		
		/*t=a;
		a=b;
		t=b;*/
		
		//Without using third variable
		a=a+b;//30
		b=a-b;//20
		a=a-b;//10
		System.out.println("After Swapping>> ");
		System.out.println("a>> "+a+" b>> "+b);
		
		
		
		
		
		

	}

}
