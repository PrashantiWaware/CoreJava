package May_Fouth_COLLECTION;

public class Employee_FourMay implements Comparable<Employee_FourMay> {
	int id;
	String name;
	double salary;
	
	
	
	
	@Override
	public int compareTo(Employee_FourMay e1) {
		
		//According to name(String) ASC order:
		  return this.name.compareTo(e1.name);
		 
		 
		  
		  //According to salary:
		  // return new Double(e1.salary).compareTo(new Double(this.salary));ORR
		   /*if(this.salary<e1.salary)
			return 1;
		else if(this.salary>e1.salary)
			return -1;
		else
		return 0;*/
		    
		
	}
	
	public Employee_FourMay() {
		
	}


	public Employee_FourMay(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee_FourMay [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
	

}
