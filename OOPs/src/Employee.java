
public class Employee {

	int id;
	String name;
	float salary;
	
	//Constructor
	public void insert(int i, String n, float j) {
		// TODO Auto-generated method stub
		
		id = i;
		name = n;
		salary = j;
		
		
	}

	//Method
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(id+" "+name+ " "+salary);
		
	}

}
