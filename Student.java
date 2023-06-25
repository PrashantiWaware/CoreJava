package MayTwo_COLLECTION;

public class Student {
	int id;
	String name;
	String course;
	float per;
	
	Student(){
		
	}

	public Student(int id, String name, String course, float per) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", per=" + per + "]";
	}
	
	

}
