package May_Fouth_EXCEPTION_TEST;

public class A {

	public static void main(String[] args) {
		System.out.println(11);
		try {
			System.out.println(11/0);
			
		}catch(NullPointerException e) {
			System.out.println("catch");
		}

	}

}
