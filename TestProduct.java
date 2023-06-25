package MarchTwentyEight_ACCEPT_DISPLAY_THIS_Keyword;

public class TestProduct {

	public static void main(String[] args) {
		Product p1=new Product();
		p1.accept(23, "Soap",30, 10);
		p1.display();
		
		
		System.out.println("==========================");
		Product p2=new Product();
		p2.accept(24, "Liquid", 50, 50);
		p2.display();

	}

}
