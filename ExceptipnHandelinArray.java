package TwentySevenApril_EXCEPTION;

public class ExceptipnHandelinArray {

	public static void main(String[] args) {
		try {
			System.out.println("1.In try open> ");
			int arr[]= {11,22,0,0,0,0};
			System.out.println("2. :"+arr[5]);
			
			int a=10/arr[5];
			System.out.println("3.result a: "+a);
			
			System.out.println("4. In try close> ");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("5. In catch>>");
		}

	}

}
