package MarchTwentySeven_CLASSOBJ;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.emp_id=45;
		e1.emp_name="Prashanti";
		e1.dept="IT";
		e1.age=25;
		e1.salary=60000;
		
		
		System.out.println("Employee details>>");
		System.out.println("Employee id>> "+e1.emp_id);
		System.out.println("Employee name>> "+e1.emp_name);
		System.out.println("Employee department>> "+e1.dept);
		System.out.println("Employee age>> "+e1.age);
		System.out.println("Employee salary>> "+e1.salary);
		
		e1.Developer();
		e1.Tester();

	}

}
