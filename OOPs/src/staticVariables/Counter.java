package staticVariables;

//java from for instance variable
public class Counter {
	
	int count = 0;//will get memory each time when the instance variable is created.
	
	Counter(){
		
		count++; //incrementing value
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating object
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
	}

}
