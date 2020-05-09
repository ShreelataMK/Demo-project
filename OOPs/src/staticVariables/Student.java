package staticVariables;

public class Student {
	
	int id;
	String name;
	static String college = "ITS"; //static variable

	public Student(int i, String n) {
		// TODO Auto-generated constructor stub
		id = i;
		name = n;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(101,"Karan");
		Student s2 = new Student(102,"Patil");
		
		//we can change the college of all objects by the single line of code
		Student.college ="BBDT";
		
		s1.display();
		s2.display();

	}

	private void display() {
		// TODO Auto-generated method stub
		System.out.println(id+" "+name+" "+college);
		
		
	}

}
