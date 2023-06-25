package MarchThirty_ENCAPSULATION;

public class Student {
	int id;
	String name;
	private float per;
	
	Student(){
		
	}

	public Student(int id, String name, float per) {
		this.id = id;
		this.name = name;
		this.per = per;
	}
	
	public void setPer (float per) {
		if(per>0 && per<=100) 
			this.per=per;
			else
				System.out.println("Invalid percentage");
		
	}
	
	float getPer() {
		return per;
		
	}
	
	void display() {
		System.out.println(id+" "+name+" "+per);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
	
	
	
	

}
