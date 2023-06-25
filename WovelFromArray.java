package TwentyfourthAprilPattern;

public class WovelFromArray {

	public static void main(String[] args) {
		String s="Prashanti";
		char[] ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			System.out.println(ch[i]);
		}

	}

}
