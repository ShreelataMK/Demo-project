import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class DataStreamExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte[]buf = {35,36,37,38};
		
		//create the new byte array input stream
		
		ByteArrayInputStream byt = new ByteArrayInputStream(buf);
		
		int k=0;
		
		while((k=byt.read())!=-1) {
			
			//conversion of a byte into character
			char ch = (char)k;
			System.out.println("ASCII value of Character is:"+k+"; Special Character is:"+ch);
			 
		}
		
		
	}

}
