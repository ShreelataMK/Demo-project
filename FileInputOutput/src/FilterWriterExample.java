import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilterWriterExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileWriter fw = new FileWriter("E:\\test.txt");
		CustomFilterWriter filterWriter = new CustomFilterWriter(fw);
		
		filterWriter.write("I Love Country.");
		
		filterWriter.close();
		
		FileReader  fr = new FileReader("E:\\test.txt");
		
		BufferedReader bufferedReader = new BufferedReader(fr);
		
		int k;
		
		while((k = bufferedReader.read())!=-1) {
			
			System.out.print((char)k);
		}
		
		bufferedReader.close();
		
		

	}

}
