package TwentyfourthAprilPattern;

public class ABuffer {

	public static void main(String[] args) {
		String s="Prashanti";
		System.out.println("Original s>>"+s);
		s.concat("Waware");
		System.out.println("After s>>"+s);
		
		System.out.println("======================");
		
		StringBuffer sb=new StringBuffer("Prashanti");
		System.out.println("Original sb>>"+sb);
		sb.append(" Waware");
		System.out.println("After sb>>"+sb);
		
		System.out.println("========================");
		sb.delete(2, 5);
		System.out.println("After sb>>"+sb);

	}

}
