package TwentyfourthAprilPattern;

public class A {

	public static void main(String[] args) {
		String s="hello";
		System.out.println("Original s>>"+s);
		s.concat("Java");
		System.out.println("after s >>"+s);
		
		System.out.println("============================");
		
		StringBuilder sb=new StringBuilder("hello");
		System.out.println("Original sb>>"+sb);
		sb.append(" Java");
		System.out.println("After sb>>"+sb);
		
		System.out.println("=====================");
		
		sb.delete(1, 4);
		System.out.println("After sb>>"+sb);

	}

}
