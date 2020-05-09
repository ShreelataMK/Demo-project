import java.util.Scanner;

public class ScannerClassExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello/This is Amman";
		
		//create scanner with the specified string object
		
		Scanner scanner = new Scanner(str);
		
		System.out.println("Boolean Result:"+scanner.hasNextBoolean());
		
		//Change the delimiter of this scanner
		scanner.useDelimiter("/");
		
		//Printing the tokenized String
		System.out.print("....Tokenizes Strings");
		
		while(scanner.hasNext()) {
			
			System.out.println(scanner.next());
		}
		
		//Display the new delimiter
		System.out.println("Delimiter used:"+scanner.delimiter());
		scanner.close();

	}

}
