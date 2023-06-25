package May_Fouth_EXCEPTION_TEST;

public class D {

	public static void main(String[] args) {
		try {
			int i=Integer.parseInt("abc");
		}catch(Exception ex){
			System.out.println("This block handel all exception");
			
		}
		catch(NumberFormatException ex){
			
		}

	}

}
