package MayTwo_COLLECTION;

import java.util.List;
import java.util.Vector;

public class List_Vector {

	public static void main(String[] args) {
		List<Integer> al=new Vector<>();
		al.add(11);
		al.add(-7);
		al.add(22);
		al.add(55);
		al.add(33);
		al.add(44);
		
		for(Integer t:al) {
			System.out.println(t);
		}

	}

}
