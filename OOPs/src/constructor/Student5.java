package constructor;

//Copying value without Constructor



public class Student5 {
	
	int id;
	String name;

	public Student5(int i, String n) {
		// TODO Auto-generated constructor stub
		
		id = i;
		name = n;
	}

	
	public Student5() {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student5 s1 = new Student5(111,"Karan");
		Student5 s2 = new Student5();
		
		s2.id = s1.id;
		s2.name = s1.name;
		
		s1.display();
		s2.display();

	}

	private void display() {
		// TODO Auto-generated method stub
		
		System.out.println(id+" "+name);
		
	}

}
