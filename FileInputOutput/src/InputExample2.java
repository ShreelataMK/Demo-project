import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

//sequenceInputStream example that read data using enumination
public class InputExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating the FileInputStream object for all the files.
		try {
			FileInputStream fin = new FileInputStream("E:\\test.txt");
			FileInputStream fin2 = new FileInputStream("E:\\test1.txt");
			FileInputStream fin3 = new FileInputStream("E:\\text2.txt");
			
			//creating an Object to all the stream
			
			Vector v = new Vector();
			
			v.add(fin);
			v.add(fin2);
			v.add(fin3);
			
			//creating enumeration object in the constructor
			
			Enumeration e = v.elements();
			SequenceInputStream bin = new SequenceInputStream(e);
			
			int i=0;
			
			while((i=bin.read())!=-1) {
				
				System.out.print((char)i);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
