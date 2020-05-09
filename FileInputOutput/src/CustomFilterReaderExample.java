import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class CustomFilterReaderExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Reader reader = new FileReader("E:\\test1.txt");
		CustomFilterReader fr = new CustomFilterReader(reader);
		
		int i;
		
		while((i=fr.read())!=-1){
			
			System.out.print((char)i);
		}
		fr.close();
		reader.close();

	}

}
