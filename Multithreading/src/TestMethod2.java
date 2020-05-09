
public class TestMethod2 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestMethod2 t1 = new TestMethod2();
	    TestMethod2 t2 = new TestMethod2();
	    
	    t1.start();
	    t2.start();

	}
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
	}

}
