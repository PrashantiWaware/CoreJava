package TwentySevenApril_EXCEPTION;

import TwentyfourthAprilPattern.Emp;

public class Exception_occured {

	public static void main(String[] args) {
		Emp e1=new Emp(101,"Prashanti");
		System.out.println(e1.getid());
		
		e1=null;
		System.out.println(e1.getid());
		System.out.println("Thank You!!");
		

	}

}
