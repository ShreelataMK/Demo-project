
public class TestMethod extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestMethod t1 = new TestMethod();
		TestMethod t2 = new TestMethod();
	    
		System.out.println("Name of t1:"+t1.getName());
		System.out.println("Name of t2:"+t2.getName());
		System.out.println("id of t1:"+t1.getId());
		
		t1.start();
		t2.start();
		
		t1.setName("Vijay");
		System.out.println("Running after changing the name"+t1.getName());

	}
	
	public void run() {
		System.out.println("Running..");
	}

}
