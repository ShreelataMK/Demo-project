//Java Program to illustrate how to define a class and fields

//Defining a Student class

public class Student {
	
	//defining fields
	
	int id; //field or data memeber or instance variable
	String name;
	
	//Creating Insert Method
	public void InsertRecord(int r, String n) {
		// TODO Auto-generated method stur
		
		id =r;
		name = n;
	}
	
	//Creating Display Method
	public void DisplayRecord() {
		// TODO Auto-generated method stub
		
		System.out.println(id+" "+name);
		
	}
	
	//creating another class TestStudent which contains the main method.

}
