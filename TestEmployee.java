package MarchTwentyEight_ACCEPT_DISPLAY_THIS_Keyword;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.accept(23, "Prashanti", 50000, "IT");
		e1.display();
		
		System.out.println("=========================");
		
		Employee e2=new Employee();
		e2.accept(45,"Rupnur",68000,"IT");
		e2.display();

	}

}
