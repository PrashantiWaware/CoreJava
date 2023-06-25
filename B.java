package May_Fouth_EXCEPTION_TEST;

public class B {

	public static void main(String[] args) {
		try {
			System.out.println(11/0);
		}catch(Exception e) {
			System.out.println(33);
		}
		catch(ArithmeticException e)
		{
			System.out.println(22);
		}

	}

}
