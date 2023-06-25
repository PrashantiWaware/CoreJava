package May_Fouth_COLLECTION;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class ARRAYLIST {

	public static void main(String[] args) {
		
		
		/*List-Allow duplicate
		 * Insertion ordered
		 * Index is present
		 */
		//List<Integer> al=new ArrayList<>();
		
		
		/*LinkedList---.>
		 * Insertion ordered
		 * node
		 * insertion/deletion*/
		//List<Integer> al=new LinkedList<>();
		
		
		/*Vector--->
		 * Legacy class
		 * Synchronised
		 */
		List<Integer> al=new Vector<>();
		
		al.add(11);
		al.add(-7);
		al.add(22);
		al.add(55);
		al.add(44);
		al.add(-7);
		al.add(22);
		al.add(55);
		al.add(33);
		
		Collections.sort(al);//Sorting with duplicate
		
		al.forEach(System.out::println);

	}

}
