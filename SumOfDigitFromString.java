package TwentyFiveAprilPattern;

public class SumOfDigitFromString {

	public static void main(String[] args) {
		String s="pqrs8923@#$";
		 char ch[]=s.toCharArray();
		 
		 int sum=0;
		 for(int i=0;i<ch.length;i++) {
			 if(ch[i]>=48 && ch[i]<=57) {
				 sum=sum+Character.getNumericValue(ch[i]);
				 
			 }
		 }
		 System.out.println(sum);

	}

}
