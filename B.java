package AprilSeventh_INHERITANCE;

public class B extends A {
	
	void m1B() {
		super.m1A();
		
		System.out.println("B-m1");
	}
	
	void m2B() {
		System.out.println("B-m2");
	}

}
