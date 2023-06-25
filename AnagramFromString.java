package TwentyFiveAprilPattern;

public class AnagramFromString {

	public static void main(String[] args) {
		String s1="abcd";
		String s2="bacd";
		
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		int cnt=0;
        boolean check=false;
        if(s1.length()==s2.length()) {
        	for(int i=0;i<ch1.length;i++) {
        		for(int j=0;j<ch2.length;j++) {
        			if(ch1[i]==ch2[j])
        				cnt++;
        		}
        		
        	}
        	if(cnt==s1.length())check=true;
        }
        if(check)
        	System.out.println("both are Anagram");
        else
        	System.out.println("both are not Anagram");
	}

}
