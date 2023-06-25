package May_Eighth_THREAD;

public class TriggerAB {

	public static void main(String[] args) {
		JobA joba=new JobA();
		Thread t1=new Thread(joba);
		t1.setName("GP");
		t1.start();
		
		JobB jobb=new JobB();
		jobb.setName("phone Pe");
		jobb.start();

	}

}
