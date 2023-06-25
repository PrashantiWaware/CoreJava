package TwentyFiveAprilPattern;

public class PrintStringWithType {

	public static void main(String[] args) {
		String s="efgh4567#$%";
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=65 && ch[i]<=90 || ch[i]>=97 && ch[i]<=122) {
				System.out.println(" alpha >>"+ch[i]);
			}
			
			else if(ch[i]>=48 && ch[i]<=57) {
				System.out.println("number >>"+ch[i]);
			}else {
				System.out.println("Special symbol>>"+ch[i]);
			}
		}

	}

}
