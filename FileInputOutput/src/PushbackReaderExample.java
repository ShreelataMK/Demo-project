import java.io.CharArrayReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushbackReaderExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		char ary[] = {'1','-','-','2','6','-','-','5','4'};
		
		CharArrayReader reader = new CharArrayReader(ary);
		
		PushbackReader push = new PushbackReader(reader);
		
		int i;
		
		while((i=push.read())!=-1) {
			if(i=='i') {
				
				int j;
				
				if((j=push.read())=='-'){
					
					System.out.print("#");
					
				}else {
					
					push.unread(j);
					
					System.out.print((char)i);
				}
			}else {
				
				System.out.print((char)i);
		}

	}
	}
}


