import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		OutputStream outputStream = new FileOutputStream("E:\\test.txt");
		
		Writer OutputStreamWriter = new OutputStreamWriter(outputStream);
		
		try {
			OutputStreamWriter.write("Hello World");
			
			OutputStreamWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
