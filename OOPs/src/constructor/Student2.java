package constructor;

//default constructor display parameterized value



public class Student2 {
	
	//initialization
	int id;
	String name;

	//constructor
	public Student2(int i, String n) {
		// TODO Auto-generated constructor stub
		
		id =i;
		name = n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object creation
		Student2 s1 = new Student2(101,"Karan");
		Student2 s2 = new Student2(102,"Rajiv");
		
		//create method
		s1.display();
		s2.display();

	}

	//Display method
	private void display() {
		// TODO Auto-generated method stub
		System.out.println(id+" "+name);
		
	}

}
