package Array;

public class TestReturnArray {
	
	//creating method which return an array
	private static int[] get() {
		// TODO Auto-generated method stub
		return new int[]{10,30,50,90,60};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calling method which return an array
		int arr[] = get();
		
		//printing and array
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}

	}

	

}
