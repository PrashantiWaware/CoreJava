package MayTwo_COLLECTION;

public class Product {
	int id;
	String name;
	int qty;
	float cost;
	
	Product(){
		
	}


	
	public Product(int id, String name, int qty, float cost) {
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.cost = cost;
		
	}

	
	
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", qty=" + qty + ", cost=" + cost + "]";
	}



	

}
