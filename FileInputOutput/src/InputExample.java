import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

//Example that reads the data from two files and write into another files
public class InputExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fin1 = new FileInputStream("E:\\test.txt");
			FileInputStream fin2 = new FileInputStream("E:\\test1.txt");
			
			FileOutputStream fout = new FileOutputStream("E:\\testout.txt");
			
			SequenceInputStream sis = new SequenceInputStream(fin1,fin2);
			
			int i;
			
			while((i=sis.read())!=-1){
				
				fout.write(i);
			}
			
			sis.close();
			fout.close();
			fin1.close();
			fin2.close();
			
			System.out.print("success..");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
