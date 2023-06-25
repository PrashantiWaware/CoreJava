package TwentySevenApril_EXCEPTION;

public class ExceptionHandel {

	public static void main(String[] args) {
		
		int a=10+5;
		System.out.println("aap-1--GP");
		
		try {
		a=10/0;
		System.out.println("aap-2--Email");
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		
		a=10*5;
		System.out.println("aap-3--AMZ");

	}

}
