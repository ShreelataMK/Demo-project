//Object Initialization through references

public class TestStudent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating objects
		Student s1 = new Student();
		Student s2 = new Student();
		
		//Initializing objects
		s1.id = 101;
		s1.name = "pari";
		
		s2.id = 102;
		s2.name = "Somnath";
		
		//printing the data
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);

	}

}
