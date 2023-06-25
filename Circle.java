package AprilSeventh_INHERITANCE;

public class Circle extends Shape {
	
	public Circle(){
		
	}
	
	public Circle(int radius) {
		super.radius=radius;
	}
	
	
	public  void calArea() {
		
		float AreaofCircle = 3.14f*radius*radius;
		System.out.println("Area of Circle>>"+AreaofCircle);
		
	}
	

}
