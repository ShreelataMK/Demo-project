import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipeReaderExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		final PipedReader read = new PipedReader();
		final PipedWriter write = new PipedWriter(read);
		
		Thread readerThread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				try {
					int data = read.read();
					
					while(data!=-1) {
						
						System.out.print((char)data);
						data = read.read();
					}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			
		});
		
		
		Thread writerThread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				try {
					write.write("I love my country\n".toCharArray());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			
		});
		
		readerThread.start();
		writerThread.start();
		
		readerThread.start();
		writerThread.start();

	}
	
	
	

}
