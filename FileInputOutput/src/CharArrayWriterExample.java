import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		CharArrayWriter out = new CharArrayWriter();
		
		out.write("Welcome to Java");
		
		FileWriter f1 = new FileWriter("E:\\test.txt");
		
		FileWriter f2 = new FileWriter("E:\\test1.txt");
		
		out.writeTo(f1);
		out.writeTo(f2);
		
		f1.close();
		f2.close();
		
		System.out.print("Success");
		
		

	}

}
