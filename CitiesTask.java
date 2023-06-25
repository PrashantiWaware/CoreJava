package May_Fifth_COLLECTION;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

public class CitiesTask {

	public static void main(String[] args) {
		Stack <String> lst1 = new Stack<>();
		lst1.add("Pune");
		lst1.add("Mumbai");
		lst1.add("Nagpur");
		lst1.add("Nashik");
		/*System.out.println("***MH***");
		lst1.forEach(t->System.out.println(t));*/
		
		List<String> lst2=new ArrayList<>();
		lst2.add("AHBD");
		lst2.add("Surat");
		lst2.add("GN");
		/*System.out.println("\n** GUJ **");
		lst2.forEach(t->System.out.println(t));*/
		
		List<String> lst3=new ArrayList<>();
		lst3.add("Rewa");
		lst3.add("Bhopal");
		lst3.add("Indore");
		/*System.out.println("\n ** MP **");
		lst3.forEach(t->System.out.println(t));*/
		
		Map<String,List<String>> state=new  HashMap<>();
		state.put("MH", lst1);
		state.put("GUJ", lst2);
		state.put("MP", lst3);
		
		Set<String> keys=state.keySet();
		for(String k: keys) {
			System.out.println(k+" : ");
			
			List<String> cities=state.get(k);
			for(String t : cities) {
				System.out.println(" > "+t);
			}
		}
		
		
		

	}

}
