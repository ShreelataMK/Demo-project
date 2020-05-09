package FinalKeyword;

//Final method cannot be overrided...
public class Honda extends Bike1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Honda honda = new Honda();
		
		honda.run();

	}

	void run() { //cTE because of final keyword on mehod...
		// TODO Auto-generated method stub
		
		System.out.println("Running safely with 100km");
		
	}

}
