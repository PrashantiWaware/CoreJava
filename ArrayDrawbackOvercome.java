package MayTwo_COLLECTION;

import java.util.ArrayList;

public class ArrayDrawbackOvercome {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		System.out.println("Initial Size>> "+al.size());
		al.add(11);
		al.add(22);
		al.add(33);
		System.out.println("After adding ele size>> "+al.size());
		al.remove(2);
		System.out.println("After deleting ale size>> "+al.size());
		
		for(Object t: al) {
			System.out.println(t);
		}
		
		

	}

}
