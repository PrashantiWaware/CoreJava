package MarchTwentyThree_METHOD;

public class AreaOfShapes {
	static void areaofcircle(float a,int r) {
		float AC=a*r*r;
		System.out.println("Area of circle>> "+AC);
		
	}
	
	static void areaofsquare(int a) {
		int AS=a*a;
		System.out.println("Area of Square>> "+AS);
	}

	public static void main(String[] args) {
		areaofcircle(3.14f,4);
		areaofsquare(5);

	}

}
