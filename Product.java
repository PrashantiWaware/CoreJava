package MarchTwentyNine_CONSTRUCTOR;

public class Product {
	int Prod_id;
	String Prod_name;
	float cost;
	int qty;
	
	Product(){
		
	}
	
	
	 Product(int Prod_id,String Prod_name,float cost,int qty) {
		this.Prod_id=Prod_id;
		this.Prod_name=Prod_name;
		this.cost=cost;
		this.qty=qty;
	}
	
	void Total_cost() {
		
		System.out.println("Total_cost>>"+(qty*cost));
		
	}
	
	void display() {
		System.out.println("Product details>>");
		System.out.println("Prod_id: "+Prod_id);
		System.out.println("Prod_name: "+Prod_name);
		System.out.println("Prod_cost: "+cost);
		System.out.println("Prod_qty: "+qty);
	}


	

}
