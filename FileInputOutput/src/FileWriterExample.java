import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileWriter fw = new FileWriter("E:\\test.txt");
			
			fw.write("Welcome to java");
			
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.print("success.");

	}

}
