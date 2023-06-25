package AprilSeventh_INHERITANCE;

public class Square extends Shape {
	
	
	public  Square() {
		
	}
	
	public Square(int side) {
		super.side=side;
		
	}
	
	void areaOfSquare() {
		int areaOfSquare=side*side;
		System.out.println("Area of Square>>"+areaOfSquare);
	}
	
	

}
