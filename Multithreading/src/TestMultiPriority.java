
public class TestMultiPriority extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestMultiPriority m1 = new TestMultiPriority();
		TestMultiPriority m2 = new TestMultiPriority();
		
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.MAX_PRIORITY);
		
		m1.start();
		m2.start();

	}
	
	
	public void run() {
		
		System.out.println("running thread name is:"+Thread.currentThread().getName());
		System.out.println("running thread name is:"+Thread.currentThread().getPriority());
	}

}
