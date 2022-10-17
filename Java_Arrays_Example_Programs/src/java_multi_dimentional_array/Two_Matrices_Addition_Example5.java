package java_multi_dimentional_array;

public class Two_Matrices_Addition_Example5 {
	public static void main(String[] args) {
		//creating two matrices
		int a[][]= {{1,2,3},{4,5,6},{6,7,8}};
		int b[][]= {{3,5,6},{6,8,9},{2,1,4}};
		
		//Creating another array to store result
		int c[][]=new int[3][3];
		
		//Adding two matrices using for loop
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				//Adding two matrices and result is storing in new matrice
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		} 
	}
}
