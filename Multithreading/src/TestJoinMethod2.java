
public class TestJoinMethod2 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestJoinMethod2 t1 = new TestJoinMethod2();
		TestJoinMethod2 t2 = new TestJoinMethod2();
		TestJoinMethod2 t3 = new TestJoinMethod2();
		
		t1.start();
		try {
			t1.join(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		t2.start();
		t3.start();

	}
	
	public void run() {
		
		for(int i=1;i<=5;i++) {
			
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
