package May_Fouth_COLLECTION;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SET_Type_collection {

	public static void main(String[] args) {
		/*Set
		 * HashSet-Not allow duplicate
		 Insertion Unordered
		  Index is not present
		 */
		//Set<Integer> st=new HashSet<>();
		
		/*LinkedHashSet--->Insertion Order*/
		//Set<Integer>  st=new LinkedHashSet<>();
		
		/*TreeSet--->Ascending Order*/
		Set<Integer> st=new TreeSet<>();
		st.add(11);
		st.add(-7);
		st.add(22);
		st.add(55);
		st.add(44);
		st.add(-7);
		st.add(22);
		st.add(55);
		st.add(33);
		
		st.forEach(System.out::println);

	}

}
