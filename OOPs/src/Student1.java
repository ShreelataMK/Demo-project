//Java Program to illustrate how to define a class and fields

//Defining a Student class

public class Student1 {
	
	//defining fields
	
	int id; //field or data memeber or instance variable
	String name;
	
	//creating main method inside the Student class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating an object or instance
		Student1 s1 = new Student1(); //creating an object of student
		
		//printing value of the subject
		System.out.println(s1.id); //accessing memeber through reference variable
		
		System.out.println(s1.name);

	}

}
