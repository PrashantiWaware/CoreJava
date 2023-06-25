package TwentySevenApril_EXCEPTION;

public class HierarchyOfTRY_CATCH {

	public static void main(String[] args) {
		try {
			int a=10/0;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			
		}
		
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		catch(RuntimeException e) {
			e.printStackTrace();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
