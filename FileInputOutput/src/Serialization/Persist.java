package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Persist {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//creating the object
		Student s1 =new Student(211,"ravi");
		
		Student2 s2 = new Student2(101,"Pooja","MSC",40000);
		
		
		
		//creating stream and writing the object
		try {
			FileOutputStream fout = new FileOutputStream("E:\\test.txt");
			
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(s1);
			
			out.writeObject(s2);
			
			out.flush();
			
			out.close();
			
			System.out.print("success");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
