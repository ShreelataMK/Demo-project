package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DepersistExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("E:\\test.txt"));
		
		Student3 s3 = (Student3)in.readObject();
		
		System.out.println(s3.id+""+s3.name+""+s3.age+""+s3.course+""+s3.fee);
		
		in.close();
	}

}
