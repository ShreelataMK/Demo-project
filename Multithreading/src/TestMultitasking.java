
public class TestMultitasking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Simple t1 = new Simple();
		Simple t2 = new Simple();
		
		t1.start();
		t2.start();

	}

}
