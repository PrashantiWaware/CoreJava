package May_Fouth_COLLECTION;

import java.util.Set;
import java.util.TreeSet;

public class EmpSetData {

	public static void main(String[] args) {
		Set<Employee_FourMay> st=new TreeSet<>();
		
		st.add(new Employee_FourMay(1,"Raj",77000));
		st.add(new Employee_FourMay(2,"Nilesh",66000));
		st.add(new Employee_FourMay(3,"Ravi",88000));
		
		st.forEach(System.out::println);
		
		

	}

}
