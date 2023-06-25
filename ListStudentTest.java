package MayTwo_COLLECTION;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListStudentTest {

	public static void main(String[] args) {
		List<Student> studentlist=new ArrayList<>();
		
		studentlist.add(new Student(10,"Prashanti","BE",77.87f));
		studentlist.add(new Student(11,"Waware","Bcom",89.78f));
		studentlist.add(new Student(12,"Rupnur","BSC",67.56f));
		
		studentlist.forEach(System.out::println);
		
		System.out.println("\nRecords Those Per>70%");
		for(Student s1:studentlist) {
			if(s1.per>70)
				System.out.println(s1);
		}
		
		System.out.println("\nRecords Those course=BE");
		for(Student s1:studentlist) {
			if(s1.course.equals("BE"))
				System.out.println(s1);
		}
		
		System.out.println("\nRecords per in dsc order");
		for(Student s1: studentlist) {
	
		
		studentlist.sort(s1,new studentlist());
		
	}
	}

}
