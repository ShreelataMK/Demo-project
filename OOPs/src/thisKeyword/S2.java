package thisKeyword;

//this to pass as an argument in the method
public class S2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		S2 s1 = new S2();
		
		s1.p();

	}

	private void p() {
		// TODO Auto-generated method stub
		
		m(this);
		
	}

	private void m(S2 s2) {
		// TODO Auto-generated method stub
		
		System.out.println("Method is invoked");
		
	}

}
