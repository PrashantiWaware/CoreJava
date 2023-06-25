package MarchTwentyEight_ACCEPT_DISPLAY_THIS_Keyword;

public class Employee {
	int emp_id;
	String emp_name;
	float salary;
	String dept;
	
	void accept(int emp_id,String emp_name,float salary,String dept) {
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.salary=salary;
		this.dept=dept;
		
		
	}
	
	void display() {
		System.out.println("Employee details>>");
		System.out.println("Employee id>>"+emp_id);
		System.out.println("Employee name>>"+emp_name);
		System.out.println("Employee salary>>"+salary);
		System.out.println("Employee dept>>"+dept);
	}

}
