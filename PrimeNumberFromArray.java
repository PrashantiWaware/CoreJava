package EighteenAprilPattern;

import java.util.Scanner;

public class PrimeNumberFromArray {

	public static void main(String[] args) {
		
		int a[]= {2,1,4,5,24,11,7,17};
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			int cnt=0;
			if(a[i]%i==0) {
				cnt++;
			}
		}
          if(cnt==2) {
        	  System.out.println(a[i]);
        	  
        	  
          }
	}

}
