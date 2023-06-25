package May_Sixteen_JDK8_Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_API_String {

	public static void main(String[] args) {
		List<String> al=new ArrayList<>();
		al.add("IND");
		al.add("NZ");
		al.add("AUS");
		al.add("SL");
		
		
		System.out.println("Lower case>> ");
		al.stream().map(t->t.toLowerCase()).forEach(System.out::println);
		
		System.out.println("Print those whose length 3>> ");
		al.stream().filter(t->t.length()==3).forEach(System.out::println);
		
		System.out.println("Count of length 3>>");
		long cnt=al.stream().filter(t->t.length()==3).count();
		System.out.println(cnt);
		
		System.out.println("Duplicate entry>> ");
		List<String> duplist=al.stream().map(t->t.toUpperCase()).collect(Collectors.toList());
		
		duplist.forEach(System.out::println);

	}

}
