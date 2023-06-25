package MarchTwentyThree_METHOD;

public class ArithMeticUsingMethod {
	
	 static int sum(int a,int b) {
		 int c=a+b;
		 System.out.println("Sum is>> "+c);
		return c;
	 }
	 
	 static void subtraction(int p,int q) {
		 int s=p-q;
		 System.out.println("Subtraction is>> "+s);
	 }
	 
	 static void division(float l,int m) {
		 float d=l/m;
		 System.out.println("Division is>>"+d);
	 }
	 
	 static void multiplication(int e,int f) {
		 int m=e*f;
		 System.out.println("Multiplication is>> "+m);
	 }
	 
	 static void average(int c) {
		 float avg=c/2.0f;
		 System.out.println("Average is>>"+avg);
	 }

	 
	public static void main(String[] args) {
		int c=sum(10,5);
		subtraction(23,7);
		division(4.8f,2);
		multiplication(12,8);
		average(c);

	}

}
