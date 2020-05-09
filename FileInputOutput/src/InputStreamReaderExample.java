import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			InputStream stream = new FileInputStream("E:\\test.txt");
			
			Reader reader = new InputStreamReader(stream);
			
			int data = reader.read();
			
			while(data!=-1) {
				
				System.out.print((char)data);
				
				data =reader.read();
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
