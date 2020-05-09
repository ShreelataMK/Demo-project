import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

public class FilterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File data = new File("E:\\test.txt");
		
		try {
			FileOutputStream file = new FileOutputStream(data);
			
			FilterOutputStream filter = new FilterOutputStream(file);
			
			String s = "Welcome to java";
			
			byte b[] = s.getBytes();
			filter.write(b);
			filter.flush();
			filter.close();
			file.close();
			
			System.out.print("success");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
