package May_Fouth_COLLECTION;

import java.util.Set;
import java.util.TreeSet;

public class SET_Collection {

	public static void main(String[] args) {
		Set<String> st=new TreeSet<>();
		st.add("IND");
		st.add("NZ");
		st.add("BAN");
		st.add("ZIM");
		st.add("SL");
		st.add("IND");
		st.add("NZ");
		st.add("BAN");
		st.add("SA");
		
		st.forEach(System.out::println);
		

	}

}
