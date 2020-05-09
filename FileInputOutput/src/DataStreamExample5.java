import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class DataStreamExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			InputStream input = new FileInputStream("E:\\testout.txt");
			DataInputStream inst = new DataInputStream(input);
			
			int count =input.available();
			byte[]ary = new byte[count];
			
			inst.read(ary);
			for(byte bt:ary) {
				
				char k=(char)bt;
				
				System.out.print(k+"-");
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
