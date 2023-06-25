package MarchThirty_ENCAPSULATION;

public class Employee {
	int emp_id;
	private int age;
	String name;
	double salary;
	
	Employee(){
		
	}

	public Employee(int emp_id, int age, String name, double salary) {
		
		this.emp_id = emp_id;
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	
	void setAge(int age) {
		if(age>17)
			this.age=age;
		else
			System.out.println("Invalid age");
	}
	
	int getAge() {
		return age;
	}
	
	void display() {
		System.out.println(emp_id+" "+age+" "+name+" "+salary);
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
	

}
