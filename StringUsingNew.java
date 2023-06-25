package TwentyfourthAprilPattern;

public class StringUsingNew {

	public static void main(String[] args) {
		Emp e1=new Emp(1,"Prashanti");
		Emp e2=new Emp(1,"Prashanti");
		
		System.out.println("e1---->"+e1.hashCode());
		System.out.println("e2---->"+e2.hashCode());
		

	}

}
