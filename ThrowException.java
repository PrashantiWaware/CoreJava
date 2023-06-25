package TwentyEightAprilExceptionHandling;

public class ThrowException {

	public static void main(String[] args) {
		int age=-7;
		try {
			if(age<0) {
				throw new AgeInvalidException(age);
			}
			System.out.println(age);
		}
		catch(Exception e) {
			System.out.println(e);   //toString()
			e.printStackTrace();
		}
		
		

	}

}
