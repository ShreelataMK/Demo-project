package thisKeyword;

//this: to pass as argument in the constructor call
public class A {
	int data = 10;
	
	A(){
		
		B b = new B(this);
		b.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();

	}

}
