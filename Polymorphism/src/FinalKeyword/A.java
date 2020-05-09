package FinalKeyword;

//static blank final variable is initialized at static block

public class A {
	
	static final int data; //static blank final variable
	
	
	static {
		
		data = 100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(""+data);

	}

}
