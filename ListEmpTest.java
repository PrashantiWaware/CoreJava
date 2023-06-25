package MayTwo_COLLECTION;

import java.util.ArrayList;
import java.util.List;

public class ListEmpTest {

	public static void main(String[] args) {
		List<Employee>  emplist=new ArrayList<>();
		emplist.add(new Employee(100,"Prashanti","Dev",77000));
		emplist.add(new Employee(101,"Waware","Tester",88000));
		emplist.add(new Employee(100,"Rupnur","Tester",55000));
		
		emplist.forEach(System.out::println);
		
		System.out.println("\nRecords those salary>70000");
		for(Employee ee:emplist) {
			if(ee.salary>70000)
				System.out.println(ee);
		}
		
		System.out.println("\nRecords Those Role=Tester");
		for(Employee ee:emplist) {
			if(ee.role.equals("Tester"))
				System.out.println(ee);
				
		}
	}

}
