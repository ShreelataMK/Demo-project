package constructor;

//default constructor display default value
public class Student {
	
	int id;
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating objects
		Student s1 = new Student();
		Student s2 = new Student();
		
		//displaying values of objects
		s1.display();
		s2.display();

	}

	private void display() {
		// TODO Auto-generated method stub
		System.out.println(id+" "+name);
		
	}

}
