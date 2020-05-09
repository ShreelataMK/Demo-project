//Initialization through Constructor

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.insert(101,"Ajeet",35000);
		e2.insert(102,"Somnath",45000);
		e3.insert(103,"Kajal",25000);
		
		e1.display();
		e2.display();
		e3.display();
		

	}

}
