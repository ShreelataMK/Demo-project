import java.io.File;

public class FileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f =new File("E:\\test.txt");
		
		String filenames[]=f.list();
		
		for(String filename:filenames) {
			System.out.println(filename);
		}
		

	}

}
