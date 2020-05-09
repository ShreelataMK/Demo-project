import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutPutStreamExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileOutputStream fout = new FileOutputStream("E://test.txt");
			
			String s = "Welcome to Java";
			byte b[] = s.getBytes();//converting string into byte array
			fout.write(b);
			fout.close();
			
			System.out.println("Success...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
