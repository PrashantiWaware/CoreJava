package May_Ninteen_LogicalTest;

public class Programe {

	public static void main(String[] args) {
		String s="nitin";
		char ch[]=s.toCharArray();
		char rev[]=new char[ch.length];
		
		for(int i=ch.length-1,j=0;i>=0;i--,j++) {
			rev[j]=ch[i];
		}
		
		String rev_str=new String(rev);
		
		if(s.equals(rev_str))
			System.out.println(s+" is Palidrome String");
		else
			System.out.println(s+" is not Palidrome String");

	}

}
