
public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calling method with anonymous object
		new Calculation().fact(5);

	}

	private void fact(int n) {
		// TODO Auto-generated method stub
		
		int fact =1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		
		System.out.println("Factorial is " +fact);
		
	}

}
