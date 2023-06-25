package TwentyFiveAprilPattern;

public class PrintDigitFromString {

	public static void main(String[] args) {
		String s="a7c@12y0p4";
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=48 && ch[i]<=57) {
				System.out.println(ch[i]);
				
			}
		}
		

	}

}
