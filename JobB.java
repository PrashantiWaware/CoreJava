package May_Eighth_THREAD;

public class JobB extends Thread {
	public void run() {
		for(int i=201;i<=210;i++) {
			System.out.println(Thread.currentThread()+"  >>"+i);
		}
		
		
		try {
			Thread.sleep(50000);
		}catch(InterruptedException e) {
			
		}
	}

}
