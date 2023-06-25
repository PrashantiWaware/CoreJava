package MarchTwentySeven_CLASSOBJ;

public class TestStudent {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.id=23;
		s1.name="Prashanti";
		s1.per=70.78f;
		
		System.out.println("Student details>>");
		System.out.println("id>> "+s1.id);
		System.out.println("name>> "+s1.name);
		System.out.println("per>> "+s1.per);
		
		s1.Doassignment();
		s1.Dostudy();

	}

}
