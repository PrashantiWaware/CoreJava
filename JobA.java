package May_Eighth_THREAD;

public class JobA implements Runnable{
	
	void m1() {
		
	}
	
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println(Thread.currentThread()+" >>"+i);
		}
		
		try {
			Thread.sleep(50000);
		}catch(InterruptedException e) {
			
		}
	}
		

}
