import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.SequenceInputStream;

public class InputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream input1 = new FileInputStream("E:\\test.txt");
			FileInputStream input2 = new FileInputStream("E:\\test1.txt");
			
			SequenceInputStream inst = new SequenceInputStream(input1,input2);
			
			int j;
			
			while((j=inst.read())!=-1) {
				System.out.print((char)j);
				
			}
			
			inst.close();
			input1.close();
			input2.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
