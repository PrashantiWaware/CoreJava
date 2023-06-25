package TwentySevenApril_EXCEPTION;

public class TRY_CATCH_A {

	public static void main(String[] args) {
		try {
			System.out.println("1.In try open> ");
			int a=10/0;
			System.out.println("2.result a: "+a);
			System.out.println("3.In try close> ");
		}catch(Exception e) {
			System.out.println("4.in catch>> ");
		}

	}

}
