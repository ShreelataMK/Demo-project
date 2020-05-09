import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class CustomFilterReader extends FilterReader{

	protected CustomFilterReader(Reader in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	
	public int read() throws IOException{
		
		int x = super.read();
		
		if((char)x == ' ') 
			return ((int)'?');
		
		else 
			
			return x;
	}
	
	
	
	

}
