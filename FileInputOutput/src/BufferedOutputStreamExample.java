import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("E://test1.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			
			String s = "Welcome World.";
			
			byte b[] = s.getBytes();
			bout.write(b);
			bout.flush();
			bout.close();
			fout.close();
			
			System.out.println("Success..");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
