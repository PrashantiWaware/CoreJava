package MarchThirty_ENCAPSULATION;

public class TestCustomerGetSetMethod {

	public static void main(String[] args) {
		CustomerGetSetMethod c1=new CustomerGetSetMethod(30,"Prashanti",5000);
		  c1.display();
		  
		  c1.setBalance(-10000);
		  System.out.println(c1.getBalance());
		  c1.display();
		  
		  c1.setName("Piraji");
		  System.out.println(c1.getName());
		  c1.display();
		  
		  System.out.println(c1);
		

	}

}
