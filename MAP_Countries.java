package May_Fifth_COLLECTION;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MAP_Countries {

	public static void main(String[] args) {
		Map<Integer,String> mp=new HashMap<>();//Simple Map
		//Map<Integer,String> mp=new LinkedHashMap<>();//Insertion ordered for key object
		//Map<Integer,String> mp=new Hashtable<>();//null key & value not allow in HashTable
		
		
		mp.put(1, "IND");
		mp.put(4, "SA");
		mp.put(2, "IND");
		mp.put(22, null);//null key & value not allow in HashTable
		mp.put(1, "BAN");
		mp.put(4, null);//null value not allow in HashTable
		mp.put(9, "KEN");
		mp.put(13, "SL");
		
		
		mp.forEach((k,v)->System.out.println(k+" : "+v));
		
		/*Set<Integer> keys=mp.keySet();
		for(Integer k: keys) {
			System.out.println(k+" : "+mp.get(k));
		}*/
		}

}
