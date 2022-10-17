package java_multi_dimentional_array;

public class Two_Matrices_Addition_Example6 {
	public static void main(String[] args) {
		int a[][]= {{1,2,3,4},{2,3,4,5},{6,5,4,7},{9,7,6,1}};
		int b[][]= {{6,5,4,7},{9,7,6,1},{1,2,3,4},{2,3,4,5}};
		
		//storing result in another array
		int c[][]=new int[4][4];
		
		//adding two matrices
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
