package MayTwo_COLLECTION;

public class BoxingUnboxing {

	public static void main(String[] args) {
		int a=10;
		//Primitive to wrapper class-->Boxing
		Integer i1=new Integer(a);
		
		//Wrapper class to primitive-->Unboxing
		float b=i1.floatValue();
		
		//Primitive to Wrapper class--Auto-Boxing
		Integer i2=a;//new Integer(a)-JVM
		
		//wrapper class to primitive-->Auto-Unboxing
		float bb=i1;//floatvalue()-jvm
		
		

	}

}
