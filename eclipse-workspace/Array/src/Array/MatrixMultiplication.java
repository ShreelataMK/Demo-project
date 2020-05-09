package Array;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating two matrices
		int a[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int b[][]= {{1,1,1},{2,2,2},{3,3,3}};
		
		//creating another matrix to store the multiplication of two matrix
		int c[][]=new int[3][3]; //3 rows and 3 columns
		
		//multiplication and printing multiplication of 2 matrix
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
				c[i][j]=0;
				
				for(int k=0;k<3;k++) {
					
					c[i][j]+=a[i][k]+b[i][j];
				}
				
				System.out.print(c[i][j]+"");
			}
			
			System.out.println();
		}

	}

}
