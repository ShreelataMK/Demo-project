package thisKeyword;

//Understanding the problem without this keyword.
//causes an ambitity problem

public class Student {
	
	int id;
	String name;
	float fee;

	public Student(int id, String name, float fee) {
		// TODO Auto-generated constructor stub
		
		id = id;
		name = name;
		fee = fee;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println(id+" "+name+" "+fee);
		
	}

}
