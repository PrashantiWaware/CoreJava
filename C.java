package May_Fouth_EXCEPTION_TEST;

public class C extends Exception {}
class Main{

	public static void main(String[] args) {
		try {
			throw new Test();
		}catch(Test t) {
			System.out.println("Got the TEST Exception");
		}
		finally {
			System.out.println("Inside Finally Block");
		}

	}

}
