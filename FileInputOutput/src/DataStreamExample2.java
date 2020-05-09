import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DataStreamExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fin;
		try {
			fin = new FileInputStream("E://test1.txt");
			
			int i=0;
			while((i=fin.read())!=-1) {
				
				System.out.print((char)i);
			}
			
			fin.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}

}
