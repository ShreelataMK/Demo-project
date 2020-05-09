package Serialization;

import java.io.Serializable;

public class Student3 implements Serializable{
	
	int id;
	String name;
	transient int age;
	String course;
	int fee;
	
	public Student3(int id, String name,int age,String course, int fee) {
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.course = course;
		this.fee = fee;
	}
	
	
	

}
