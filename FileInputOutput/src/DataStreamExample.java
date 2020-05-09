import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DataStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fin = new FileInputStream("E://test1.txt");
			
			int i = fin.read();
			System.out.println((char)i);
			
			fin.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
