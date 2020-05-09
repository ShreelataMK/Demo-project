package thisKeyword;

//Real usage of this constructor call
public class Student4 {
	
	int rollno;
	String name;
	String course;
	float fee;

	public Student4(int rollno, String name, String course) {
		// TODO Auto-generated constructor stub
		
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}

	public Student4(int rollno, String name, String course, float fee) {
		// TODO Auto-generated constructor stub
		
		this(rollno,name,course);//reusing the constructor
		this.fee = fee;
		
		//this.fee = fee;//C.T Error(Compile time error)
		//this(rollno,name,course);//reusing the constructor
		
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println(rollno+" "+name+" "+course+" "+fee);
		
	}

}
