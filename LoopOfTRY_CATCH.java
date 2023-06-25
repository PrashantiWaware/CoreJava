package TwentySevenApril_EXCEPTION;

public class LoopOfTRY_CATCH {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			int a=10/0;
			System.out.println(2);
			try {
				System.out.println(3);
				
			}
			catch(Exception e) {
				System.out.println("4 ---nested catch");
			}
			System.out.println(5);
		}
		catch(Exception e) {
			System.out.println("6--main catch");
		}

	}

}
