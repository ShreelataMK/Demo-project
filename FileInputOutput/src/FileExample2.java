import java.io.File;

public class FileExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File dir =new File("E:\\test.txt");
		
		File files[]=dir.listFiles();
		
		for(File file:files) {
			System.out.println(file.getName()+"Can writer:"+file.canWrite()+"");
		}
		

	}

}
