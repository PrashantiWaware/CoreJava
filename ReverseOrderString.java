package TwentyFiveAprilPattern;

public class ReverseOrderString {

	public static void main(String[] args) {
		//Print reverse order
		//gen reverse string from given string
		String s="Prashanti";
		char ch[]=s.toCharArray();
		char rev[]=new char[ch.length];
		
		for(int i=ch.length-1,j=0;i>=0;i--,j++) {
			rev[j]=ch[i];
			
		}
		String rev_str=new String(rev);
		System.out.println(rev_str);
		

	}

}
