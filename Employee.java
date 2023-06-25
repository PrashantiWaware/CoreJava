package ThirtyOne;

public class Employee {
	int id;
	String name;
	private int age;
	double salary;
	
	public Employee(){
		
	}
	
	public Employee(int id,String name,int age,double salary){
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	

	
	public void setAge(int age) {
		if(age>18) 
			this.age=age;
			else 
				System.out.println("Invalid Age>>");
			
		}
	
	public int getAge(int age) {
		return age;
	}
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
	
}
