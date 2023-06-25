package MarchTwentyEight_ACCEPT_DISPLAY_THIS_Keyword;

public class TestStudent {

	public static void main(String[] args) {
		Student_withoutTHIS s1=new Student_withoutTHIS();
		s1.accept(23, "Prashanti", 78.89f);
		s1.display();
		
		System.out.println("================");
		
		Student_withoutTHIS s2=new Student_withoutTHIS();
		s2.accept(34, "Waware", 67.78f);
		s2.display();

	}

}
