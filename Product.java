package MarchTwentyEight_ACCEPT_DISPLAY_THIS_Keyword;

public class Product {
	int prod_id;
	String prod_name;
	int prod_qty;
	float cost;
	
	void accept(int prod_id,String prod_name,int prod_qty,float cost) {
		this.prod_id=prod_id;
		this.prod_name=prod_name;
		this.prod_qty=prod_qty;
		this.cost=cost;
		
	}
	
	void display() {
		System.out.println("Product details>>");
		System.out.println("Product id>>"+prod_id);
		System.out.println("Product name>>"+prod_name);
		System.out.println("Product qty>>"+prod_qty);
		System.out.println("Product cost>>"+cost);
		
	}

}
