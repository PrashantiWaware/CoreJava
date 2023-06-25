package MayTwo_COLLECTION;

public class Employee {
	int id;
	String name;
	String role;
	double salary;
	
	Employee(){
		
	}

	public Employee(int id, String name, String role, double salary) {
		this.id = id;
		this.name = name;
		this.role = role;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", salary=" + salary + "]";
	}
	
	
	
	

}
