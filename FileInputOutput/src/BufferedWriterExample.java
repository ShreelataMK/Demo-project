import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileWriter writer = new FileWriter("E:\\test.txt");
			
			BufferedWriter buffer = new BufferedWriter(writer);
			
			buffer.write("welcome to java");
			
			buffer.close();
			
			System.out.print("Success");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
