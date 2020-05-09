import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferOutputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			FileOutputStream fout = new FileOutputStream("E://test1.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			
			String s = "Java is Learning fun.";
			
			byte b[] = s.getBytes();
			bout.write(b);
			bout.flush();
			bout.close();
			fout.close();
			
			System.out.println("success");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
