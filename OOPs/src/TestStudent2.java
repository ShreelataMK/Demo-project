//Object Initialization through method
public class TestStudent2 {
	
	int rollno;
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating an Object
		Student s1 = new Student();
		Student s2 = new Student();
		
		//Creating Insert Method
		s1.InsertRecord(101,"Karan");
		s2.InsertRecord(102,"Rajiv");
		
		//Creating Display Method
		s1.DisplayRecord();
		s2.DisplayRecord();

	}

}
