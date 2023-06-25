
package May_Sixteen_JDK8_Features;

@FunctionalInterface //only one abstract method 

public interface I1 {
	
	void m1(int t1, int t2);//abstract method
	
	static void m2() {
		System.out.println("Static");
	}
	
	default void m3() {
		System.out.println("Default");
	}

}
