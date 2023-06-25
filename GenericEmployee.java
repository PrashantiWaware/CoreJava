package May_Sixteen_JDK8_Features;

public class GenericEmployee {
	
	int id;
	String name;
	String role;

	public GenericEmployee() {
		
	}
	
	

	public GenericEmployee(int id, String name, String role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}
	
	



	@Override
	public String toString() {
		return "GenericEmployee [id=" + id + ", name=" + name + ", role=" + role + "]";
	}



	public static void main(String[] args) {
		

	}

}
