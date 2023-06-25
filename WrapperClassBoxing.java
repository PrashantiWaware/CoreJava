package TwentyFiveAprilPattern;

public class WrapperClassBoxing {

	public static void main(String[] args) {
		int a=10;
		
		//primitive to wrapper class:-Boxing
		Integer i1=new Integer(a);
		
		//Wrapper class to primitive:-UnBoxing
		float b=i1.floatValue();
		
		//Primitive to Wrapper class:-Auto-Boxing
		Integer i2=a; //new Integer(a)-JVM
		
		//wrapper class to primitive:-Auto-UnBoxing
		
		float b2=i1;  //floatValue()-JVM
		System.out.println(b2);
		

	}

}
