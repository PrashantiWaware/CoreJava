package May_Sixteen_JDK8_Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_API {
	public static void main(String[]args) {
		List<Integer> al=new ArrayList<>();
		al.add(11);
		al.add(22);
		al.add(33);
		al.add(44);
		al.add(55);
		
		List<Integer> evenlist=al.stream().filter(t-> t%2==0).
				collect(Collectors.toList());
		
		/*for(Integer t:al) {
			if(t%2==0) {
				System.out.println(t);
			}
		}*/
	
		
		
	evenlist.forEach(System.out::println);
	}

}
