package TwentyfourthAprilPattern;

public class B {

	public static void main(String[] args) {
		String a="Prashanti";
		String s1=new String("Waware");
		
		String b="Waware";
		String c="Waware";
		String s2=new String("Waware");
		
		System.out.println("a----->"+a.hashCode());
		System.out.println("s1---->"+s1.hashCode());
		System.out.println("b---->"+b.hashCode());
		System.out.println("c---->"+c.hashCode());
		System.out.println("s2--->"+s2.hashCode());
		
		System.out.println("b==s1 >"+(b==s1));
		System.out.println("b==c >"+(b==c));
		

	}

}
