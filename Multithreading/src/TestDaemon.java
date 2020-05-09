
public class TestDaemon extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestDaemon t1 = new TestDaemon();
		TestDaemon t2 = new TestDaemon();
		TestDaemon t3 = new TestDaemon();
		
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();

	}
	
	public void run() {
		
		if(Thread.currentThread().isDaemon()) {
		System.out.println("Daemon is work.");
	}
		else {
			
			System.out.println("User Threa is working...");
		}
	}

}
