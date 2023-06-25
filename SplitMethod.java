package TwentyfourthAprilPattern;

public class SplitMethod {

	public static void main(String[] args) {
		String s="The ,kiran ,Aca ,Pune";
		String[] sss=s.split(",");
		
		for(int i=0;i<sss.length;i++) {
			System.out.println(sss[i]);
		}

	}

}
