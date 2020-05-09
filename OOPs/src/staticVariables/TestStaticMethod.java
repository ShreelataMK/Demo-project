package staticVariables;


//Test class for display and create the value of object
public class TestStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student2.college = "BBTS";
		
		//creating objects
		Student2 s1 = new Student2(101,"Karan");
		Student2 s2 = new Student2(102,"Aryan");
		Student2 s3 = new Student2(103,"Sonoo");
		
		//calling display method
		s1.display();
		s2.display();
		s3.display();

	}

}
