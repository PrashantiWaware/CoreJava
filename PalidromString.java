package TwentysixApril;

public class PalidromString {

	public static void main(String[] args) {
		String s="NITIN";
		char ch[]=s.toCharArray();
         char rev[]=new char[ch.length];
         
         for(int i=ch.length-1, j=0;i>=0;i--,j++) {
        	 rev[j]=ch[i];
         }
         
         String rev_str=new String(rev);
         
         if(s.equals(rev_str))
        	 System.out.println(s+" is Palidrom");
         else
        	 System.out.println(s+" is not Palidrom");
         
		

	}

}
