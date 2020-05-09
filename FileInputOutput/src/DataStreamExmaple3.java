import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//Byte Array Stream Example used to write into multiple files
public class DataStreamExmaple3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileOutputStream fout1 = new FileOutputStream("E:\\test.txt");
			FileOutputStream fout2 = new FileOutputStream("E:\\test1.txt");
			
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			
			bout.write(65);
			bout.writeTo(fout1);
			bout.writeTo(fout2);
			
			bout.flush();
			bout.close();
			
			System.out.print("success");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
