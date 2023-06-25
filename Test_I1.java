package May_Sixteen_JDK8_Features;

public class Test_I1 {

	public static void main(String[] args) {
		I1.m2();//Static
		I1 objA= (int t1, int t2)->{ 
			System.out.println(t1+" "+t2);
			System.out.println("Sum>>"+(t1+t2));
			
			
		};//It can also use Parent reference(I1)
		//A objA=new A();
		objA.m3();//default
		objA.m1(20,10);

	}

}
