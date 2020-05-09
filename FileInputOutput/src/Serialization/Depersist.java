package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Depersist {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//creating stream to read the object
		
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("E:\\test.txt"));
			
			Student s = (Student)in.readObject();
			
			Student2 s2 = (Student2)in.readObject();
			
			//print the data of the serialized object
			System.out.println(s.id+""+s.name);
			
			System.out.println(s2.id+""+s2.name+""+s2.course+""+s2.fee);
			
			//closing the stream
			in.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
