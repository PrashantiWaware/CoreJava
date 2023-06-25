package TwentyEightAprilExceptionHandling;

import java.io.FileInputStream;

public class FinallyException {

	public static void main(String[] args) {
		try {
			System.out.println("try[code] start");
			FileInputStream fis=new FileInputStream("pqr.txt");
			
			System.out.println("well and good...");
			int a=10/3;
		} catch(Exception e) {
			System.out.println("** Now in catch block **");
		}finally {
			System.out.println("finally..file.close()");
		}
		

	}

}
