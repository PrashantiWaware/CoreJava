package MarchTwentySeven_CLASSOBJ;

public class TestCustomer {

	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.acc_no=15527671;
		c1.name="Prashanti";
		c1.email_id="pwaware@gmail.com";
		c1.mob_no=8600369;
		c1.pan_no="AD6126";
		c1.adhar_no=878677;
		c1.age=25;
		c1.address="Pune";
		c1.bal=25000.89f;
		c1.is_married=true;
		
		System.out.println(c1.acc_no);
		System.out.println(c1.name);
		System.out.println(c1.email_id);
		System.out.println(c1.mob_no);
		System.out.println(c1.pan_no);
		System.out.println(c1.adhar_no);
		System.out.println(c1.age);
		System.out.println(c1.address);
		System.out.println(c1.bal);
		System.out.println(c1.is_married);
		
		c1.ChechBal();
		c1.Deposite();
		c1.Withdraw();
		
		
		

	}

}
