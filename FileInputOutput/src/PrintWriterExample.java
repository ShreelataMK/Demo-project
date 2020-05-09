import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//Data to write on Console using PrintWriter
		
		PrintWriter writer = new PrintWriter(System.out);
		
		writer.write("Hello Welocme to Wrold.");
		
		writer.flush();
		
		writer.close();
		
		//Data to write in File using PrintWriter
		PrintWriter writer1 = null;
		writer1 = new PrintWriter(new File("E:\\test.txt"));
		
		writer1.write("Like Java HTML");
		
		writer1.flush();
		
		writer1.close();
		
		
		

	}

}
