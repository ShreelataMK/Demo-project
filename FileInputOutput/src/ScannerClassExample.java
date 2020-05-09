import java.util.Scanner;

public class ScannerClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello,This is java.";
		
		//create scanner Object and pass string in it
		
		Scanner scan = new Scanner(s);
		
		//check if the scanner has a token
		System.out.println("Boolean Result:"+scan.hasNext());
		
		//Print the String
		System.out.println("String:"+scan.nextLine());
		
		scan.close();
		
		System.out.println("...Enter Your Details...");
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your name");
		
		String name = in.next();
		
		System.out.println("Name:"+name);
		
		System.out.println("Enter your age:");
		
		int i = in.nextInt();
		
		System.out.println("age:"+i);
		
		System.out.println("Enter your salary:");
		
		double d =in.nextDouble();
		
		System.out.println("Salary:"+d);
		
		in.close();
		
		

	}

}
