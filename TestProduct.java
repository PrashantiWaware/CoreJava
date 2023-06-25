package MarchTwentyNine_CONSTRUCTOR;

public class TestProduct {

	public static void main(String[] args) {
		Product p1=new Product(12,"Soap",20,50);
		p1.display();
		p1.Total_cost();
		
		System.out.println("==============================");
		
		Product p2=new Product(10,"Dettol",10,20);
		p2.display();
		p2.Total_cost();
		

	}

}
