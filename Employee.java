package AprilSix_INHERITANCE;

public class Employee extends Person{
	String dept;
	int salary;
	
	
	
	
	
	
	
	public Employee(int id,String name,int mob,String dept, int salary) {
		super(id,name,mob);
		this.dept = dept;
		this.salary = salary;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+mob+" "+dept+" "+salary);
	}







	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", salary=" + salary + ", id=" + id + ", name=" + name + ", mob=" + mob + "]";
	}
	
	
	
	
	
	

}
