package MayTwo_COLLECTION;

import java.util.ArrayList;
import java.util.List;

public class TestProduct {

	public static void main(String[] args) {
		List<Product> prodlist=new ArrayList<>();
		prodlist.add(new Product(200,"Liquid",10,130.5f));
		prodlist.add(new Product(201,"Soap",4,40.12f));
		prodlist.add(new Product(200,"Powder",30,150.5f));
		
		
		prodlist.forEach(System.out::println);
		
		System.out.println("\nRecords Those qty>5");
		for(Product p1:prodlist) {
			if(p1.qty>5)
				System.out.println(p1);
		}
		
		System.out.println("\nRecords Those cost>100");
		for(Product p1:prodlist) {
			if(p1.cost>100)
				System.out.println(p1);
		}
		
		
		
		}

}
