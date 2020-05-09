import java.io.IOException;
import java.io.StringReader;

public class StringReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String srg = "Hello Java \n Welcome to World.";
		StringReader reader = new StringReader(srg);
		
		int k=0;
		while((k=reader.read())!=-1) {
			
			System.out.print((char)k);
		}

	}

}
