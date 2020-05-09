
public class TestCallRun2 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestCallRun2 t1 = new TestCallRun2();
		TestCallRun2 t2 = new TestCallRun2();
		
		t1.run();
		t2.run();

	}
	
	
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			
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
