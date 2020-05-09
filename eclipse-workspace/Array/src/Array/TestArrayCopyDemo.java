package Array;

public class TestArrayCopyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring a source array
		
		char[] copyFrom = {'d','e','c','a','f','f','e','i','n','t'};
		
		//declaration a destination array
		char[]copyTo = new char[7];
		
		System.arraycopy(copyFrom,2,copyTo,0,7);
		
		System.out.println(String.valueOf(copyTo));

	}

}
