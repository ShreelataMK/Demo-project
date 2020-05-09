package Array;

public class TestArray7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {33,3,4,5};
		System.out.println("Printing orginal array.");
		
		for(int i:arr) 
			
			System.out.println(i);
			
			System.out.println("Printing clone of the array:");
			
			int carr[]=arr.clone();
			
			for(int j:carr)
				
				System.out.println(j);
			
			System.out.print("are both equal?");
			
			System.out.print(arr==carr);
		

	}

}
