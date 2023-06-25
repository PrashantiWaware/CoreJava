package May_Sixteen_JDK8_Features;

public class TestGenerics {

	public static void main(String[] args) {
		GenericEmployee e1=new GenericEmployee(101,"Rajesh","Dev");
		Generics obj=new Generics();
		
		obj.printData(10.5f,true);
		obj.printData(11,e1);
		obj.printData(11.6,"Welcome");
		obj.printData(e1,3425656);

	}

}
