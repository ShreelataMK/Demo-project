import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileDescriptorExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileDescriptor fd = null;
		
		byte[] b = {48,49,50,51,53,54,55,56,58};
		
		FileOutputStream fos = new FileOutputStream("test.txt");
		
		FileInputStream fis = new FileInputStream("test.txt");
		
		fd = fos.getFD();
		
		fos.write(b);
		
		fos.flush();
		
		fd.sync();//confirm data to be written to the disk
		
		int value =0;
		
		//for every available byte
		
		while((value=fis.read())!=-1) {
			
			char c = (char)value; //convert byte to char
			
			System.out.print(c);
		}
		
		System.out.println("\nSync() successfully executed.");

	}

}
