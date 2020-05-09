package staticVariables;

public class Counter2 {
	
	//will get memory only once and retain its value.
	static int count = 0;
	
	Counter2(){
		
		//incrementing the value of static variable
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating objects
		Counter2 c1 = new Counter2();
		Counter2 c2 = new Counter2();
		Counter2 c3 = new Counter2();

	}

}
