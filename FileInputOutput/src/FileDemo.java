import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("E:\\test.txt");
		
		if(file.createNewFile()) {
			
			System.out.println("New file is Created.");
		}
		else {
			
			System.out.println("Already Exist.");
		}
		

	}

}
