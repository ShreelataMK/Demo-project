//Sleep Method 
public class TestSleepMethod extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestSleepMethod t1 = new TestSleepMethod();
		TestSleepMethod t2 = new TestSleepMethod();
		
		t1.start();
		t2.start();

	}
	
	
	public void run() {
		
		for(int i=1;i<5;i++) {
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(i);
		}
	}

}
