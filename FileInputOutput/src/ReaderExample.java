import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Reader reader = new FileReader("output.txt");
			
			int data;
			try {
				data = reader.read();
				
				while(data!=-1) {
					
					System.out.print((char)data);
					
					data =reader.read();
							
				}
				
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.print(e.getMessage());
		}

	}

}
