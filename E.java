package May_Fouth_EXCEPTION_TEST;

public class E {

	public static void main(String[] args) {
		try {
			int a,b;b=0;a=5/b;
			System.out.println("A");
		}catch(ArithmeticException e) {
			System.out.println("B");
		}finally {
			System.out.println("C");
		}

	}

}
