import java.io.File;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path = "";
		
		boolean bool =false;
		
		File file = new File("E:\\test.txt");
		
		file.createNewFile();
		
		System.out.println(file);
		
		//creating new canonical from file object
		
		File file2 = file.getCanonicalFile();
		
		//return true if the file exists
		
		System.out.println(file2);
		bool = file2.exists();
		
		//return absoulte pathname
		
		path =file2.getAbsolutePath();
		
		System.out.print(bool);
		
		if(bool) {
			
			//print
			
			System.out.print(path+"Exist?"+bool);
		}

	}

}
