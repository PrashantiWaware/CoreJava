package MarchTwentyNine_CONSTRUCTOR;

public class Employee {
	int emp_id;
	String emp_name;
	float basic_sal;
	
	Employee(){
		
	}
	
	Employee(int emp_id,String emp_name,float basic_sal){
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.basic_sal=basic_sal;
	}
	
	void Gross_sal() {
		float DA=(10*basic_sal)/100;
		float HRA=(15*basic_sal)/100;
		System.out.println("DA= "+DA);
		System.out.println("HRA= "+HRA);
		System.out.println("Gross_sal>>"+(basic_sal+DA+HRA));
		
	}
	
	void display() {
		System.out.println("Employee Details>>");
		System.out.println("Employee id>>"+emp_id);
		System.out.println("Employee name>>"+emp_name);
		System.out.println("Employee Basic_sal>>"+basic_sal);
	}

}
