package MarchThirty_ENCAPSULATION;

public class CustomerGetSetMethod {
	private int acc_no;
	private String name;
	private double balance;
	
	CustomerGetSetMethod(){
		
	}
	
	CustomerGetSetMethod(int acc_no,String name,float balance){
		this.acc_no=acc_no;
		this.name=name;
		this.balance=balance;
	}
	
	void setBalance(double amt) {
		if(amt>0) 
			balance=amt;
		else
			System.out.println("Invalid amount");
	}
	
	double getBalance() {
		return balance;
	}
	
	void setName(String name) {
		this.name=name;
		
	}
	
	String getName() {
		return name;
	}
	
	void display() {
		System.out.println(acc_no+" "+name+" "+balance);
		
		
	}

	@Override
	public String toString() {
		return "CustomerGetSetMethod [acc_no=" + acc_no + ", name=" + name + ", balance=" + balance + "]";
	}
	

	
	
	
	

}
