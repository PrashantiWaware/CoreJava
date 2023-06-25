package AprilSix_INHERITANCE;

public class Doctor extends Person {
	
	String specialist;
	String degree;
	
	
	public Doctor(int id,String name,int mob,String specialist, String degree) {
		super(id,name,mob);
		this.specialist = specialist;
		this.degree = degree;
	}
	
	
	void display() {
		System.out.println(id+" "+name+" "+mob+" "+specialist+" "+degree);
	}


	@Override
	public String toString() {
		return "Doctor [specialist=" + specialist + ", degree=" + degree + ", id=" + id + ", name=" + name + ", mob="
				+ mob + "]";
	}
	
	
	
	
	

}
