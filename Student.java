package MarchTwentyNine_CONSTRUCTOR;

public class Student {
	int id;
	String name;
	float per;
	
	Student(){
		
	}
	
	Student(int id,String name,float per){
		this.id=id;
		this.name=name;
		this.per=per;
		
	}
	
	void display() {
		System.out.println("Student details>>>");
		System.out.println("Student id: "+id);
		System.out.println("Student name: "+name);
		System.out.println("Student per: "+per);
	}

}
