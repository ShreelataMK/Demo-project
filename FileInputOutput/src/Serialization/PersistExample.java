package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PersistExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Student3 s1 = new Student3(212,"ravi",25,"MSC",45000);//creating the object
		
		//write object into file
		FileOutputStream f = new FileOutputStream("E:\\test.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(f);
		
		out.writeObject(s1);
		
		out.flush();
		out.close();
		System.out.print("success");
		
	}

}
