import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;

public class FilterExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File data = new File("E:\\test.txt");
		
		FileInputStream file;
		try {
			file = new FileInputStream(data);
			
			FilterInputStream filter = new BufferedInputStream(file);
			
			int k=0;
			
			while((k=filter.read())!=-1) {
				
				System.out.print((char)k);
			}
			
			file.close();
			
			filter.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
