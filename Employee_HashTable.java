package May_Fifth_COLLECTION;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import May_Fouth_COLLECTION.Employee_FourMay;

public class Employee_HashTable {

	public static void main(String[] args) {
		
		Employee_FourMay e1=new Employee_FourMay(101,"Raj",77000);
		Employee_FourMay e2=new Employee_FourMay(102,"Ravi",89000);
		Employee_FourMay e3=new Employee_FourMay(103,"Sima",67000);
		
		Map<String,Employee_FourMay> mp=new Hashtable<>();
		
		mp.put("MH", e1);
		mp.put("GUJ", e2);
		mp.put("MP", e3);
		
		Set<String> keys=mp.keySet();
		for(String k: keys) {
			System.out.println(k+" : "+mp.get(k));
		}
		
		
		
		
		

	}

}
