package constructor;

//Java Program to overload constructor

public class Student3 {
	
	int id;
	String name;
	int age;
	
	

	public Student3(int i, String n) {
		// TODO Auto-generated constructor stub
		id = i;
		name = n;
	}



	public Student3(int i, String n, int a) {
		// TODO Auto-generated constructor stub
		id= i;
		name = n;
		age = a;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student3 s1 = new Student3(111,"Karan");
		Student3 s2 = new Student3(222,"Aryan",25);
		
		s1.display();
		s2.display();

	}



	private void display() {
		// TODO Auto-generated method stub
		
		System.out.println(id+" "+name+" "+age);
		
	}

}
