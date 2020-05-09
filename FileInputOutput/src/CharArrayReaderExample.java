import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		char[]ary = {'j','a','v','a'};
		
		CharArrayReader reader = new CharArrayReader(ary);
		
		int k=0;
		
		//Read until the end a file
		
		while((k=reader.read())!=-1) {
			
			char ch =(char)k;
			
			System.out.print(ch+"i");
			
			System.out.println(k);
			
		}

	}

}
