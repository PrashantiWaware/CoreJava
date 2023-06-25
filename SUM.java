package May_Eighteen_TraceTheOutput;

public class SUM {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=5;i++)
		 {
			 sum=sum+i;//sum=1,sum=1+2,sum=3+3,sum=6+4,10,11
			 if(i==3)
			i++;
		}
		System.out.println(sum);
		
		/*int sum=0;
		for(int i=1;i<=5;i++) 
		{
			   sum=sum+i;
			   
			i--;//No condition fulfill
		}
		System.out.println(sum);*/
		
		/*int sum=0;
		int i=2;
		while(i<=5) {
			sum=sum+i;
			i++;
		}
		
		System.out.println(sum);*/
		
		
		int a=2;
		int res=a++ +a--  +  ++a + --a  ;
		      //2(3)+3(2) +  3 +  2     =10
		System.out.println(a+" "+res);
		                   //a=2
		
		
		

	}

}
