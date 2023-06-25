package MarchThirty_ENCAPSULATION;

public class TestStudent {

	public static void main(String[] args) {
		Student s1=new Student(12,"Prashanti",67.89f);
		s1.display();
		
		s1.setPer(101.0f);
		System.out.println(s1.getPer());
		s1.display();
		
		System.out.println(s1);
		

	}

}
