import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Writer w;
		try {
			w = new FileWriter("output.txt");
			
			String content ="I love java";
			
			w.write(content);
			
			w.close();
			
			System.out.println("Done");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
