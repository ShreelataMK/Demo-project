import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStreamReader r = new InputStreamReader(System.in);
		
		BufferedReader br =new BufferedReader(r);
		
		System.out.println("Enter your name");
		
		try {
			String name = br.readLine();
			
			System.out.println("Welcome"+name);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
