package TwentyEightAprilExceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsException {
	void m1() throws IOException{
		FileInputStream fis=new FileInputStream("pqr.txt");
		fis.close();
	}
	
	void m2() {
		System.out.println("hello");
	}

}
