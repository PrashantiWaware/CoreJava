package TwentyEightAprilExceptionHandling;

import java.io.FileInputStream;

public class Runtime_CompiletimeExc {

	public static void main(String[] args) {
		int a=10/0;  //Arithmetic----Runtime
		System.out.println(a);
		
		FileInputStream fis=new FileInputStream("c:\\pqr.txt");   //compiletime
		
		//not allow to write code after compile-time----exception
		
		int c=10+5;

	}

}
