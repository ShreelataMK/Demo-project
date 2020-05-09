import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {
	
	static final String FILEPATH ="test.txt";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(new String(readFrom(FILEPATH,0,18)));
		
		writeToFile(FILEPATH,"I love my Country.",31);

	}

	private static void writeToFile(String filepath2, String data, int position) throws Exception {
		// TODO Auto-generated method stub
		RandomAccessFile file = new RandomAccessFile(filepath2,"rw");
		file.seek(position);
		file.write(data.getBytes());
		
		
		
	}

	private static byte[] readFrom(String filepath2, int position, int size) throws Exception {
		// TODO Auto-generated method stub
		
		RandomAccessFile file = new RandomAccessFile(filepath2,"r");
		file.seek(position);
		
		byte[]bytes = new byte[size];
		return bytes;
	}

}
