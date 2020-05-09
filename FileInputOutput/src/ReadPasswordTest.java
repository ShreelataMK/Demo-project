import java.io.Console;

public class ReadPasswordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Console c=System.console();
		
		System.out.println("Enter the Password:");
		
		char[]ch=c.readPassword();
		
		String pass =String.valueOf(ch); //converting char array into String

		System.out.print(""+pass);
	}

}
