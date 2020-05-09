package constructor;

//Intialize the value from one Object to another object

public class Student4 {
	
	int id;
	String name;

	

	public Student4(int i, String n) {
		// TODO Auto-generated constructor stub
		
		id = i;
		name = n;
	}
	

	public Student4(Student4 s1) {
		// TODO Auto-generated constructor stub
		
		id = s1.id;
		name = s1.name;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student4 s1 =new Student4(111,"Karan");
		Student4 s2 = new Student4(s1);
		
		s1.display();
		s2.display();

	}

	private void display() {
		// TODO Auto-generated method stub
	  System.out.println(id+" "+name);
	  }

}
