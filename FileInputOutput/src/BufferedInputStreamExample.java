import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferedInputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fin = new FileInputStream("E:\\test1.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			
			int i;
			
			while((i=bin.read())!=-1) {
				
				System.out.print((char)i);
			}
			
			bin.close();
			fin.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
