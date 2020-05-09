import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
			
			try {
				FileReader fr = new FileReader("E:\\test.txt");
				
				int i;
				
				while((i=fr.read())!=-1) {
					
					System.out.print((char)i);
					
					
				}
				
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			

	}

}
