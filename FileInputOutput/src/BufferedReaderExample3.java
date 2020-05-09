import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStreamReader r =new InputStreamReader(System.in);
		
		BufferedReader br =new BufferedReader(r);
		
		String name = "";
		
		while(!name.equals("stop")) {
			
			System.out.print("Enter data");
			
			name = br.readLine();
			
			System.out.print("data is:"+name);
			
			
			
		}

	}

}
