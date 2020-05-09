import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		FileOutputStream fout = new FileOutputStream("E:\\test.txt");
		
		PrintStream pout = new PrintStream(fout);
		
		pout.println(2016);
		
		pout.println("Hello");
		
		pout.println("Welcome");
		
		pout.close();
		
		System.out.println("Success");
		

	}

}
