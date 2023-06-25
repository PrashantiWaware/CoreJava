package AprilSeventh_INHERITANCE;

public class Rectangle extends Shape{
	
	public Rectangle() {
		
	}
	
	public Rectangle(int length,int width) {
		super.length=length;
		super.width=width;
	}
	
	public void areaOfRectangle() {
		int areaOfRectangle=length*width;
		System.out.println("Area of Rectangle"+areaOfRectangle);
	}

}
