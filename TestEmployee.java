package MarchThirty_ENCAPSULATION;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee(100,18,"Prashanti",50000);
		e1.display();
		
		e1.setAge(20);
		System.out.println(e1.getAge());
		e1.display();
		
		System.out.println(e1);


	}

}
