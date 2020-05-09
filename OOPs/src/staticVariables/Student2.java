package staticVariables;

public class Student2 {
	
	int id;
	String name;
	static String college = "ITS";

	public Student2(int i, String n) {
		// TODO Auto-generated constructor stub
		id = i;
		name = n;
	}

	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println(id+" "+name+" "+college);
		
	}

}
