package AprilSix_INHERITANCE;

public class Student extends Person {
	float per;
	String course;
	
	
	public Student(int id,String name,int mob,float per, String course) {
		super( id, name, mob);
		this.per = per;
		this.course = course;
	
	}
	
	void display() {
		System.out.println(id+" "+name+" "+mob+" "+per+" "+course);
	}

	@Override
	public String toString() {
		return "Student [per=" + per + ", course=" + course + ", id=" + id + ", name=" + name + ", mob=" + mob + "]";
	}
	
	
	
}
