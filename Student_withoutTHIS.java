package MarchTwentyEight_ACCEPT_DISPLAY_THIS_Keyword;

public class Student_withoutTHIS {
	int id;
	String name;
	float per;
	
	void accept(int a,String b,float c) {
		id=a;
		name=b;
		per=c;
		
	}
	
	void display() {
		System.out.println("Student details>>");
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("per: "+per);
	}
	

}
