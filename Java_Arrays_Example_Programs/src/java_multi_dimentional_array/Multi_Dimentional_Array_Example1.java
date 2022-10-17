package java_multi_dimentional_array;

public class Multi_Dimentional_Array_Example1 {
	public static void main(String[] args) {
		//declaring and initializing 2D array
		int arr[][]= {{1,2,3},{7,4,5},{9,4,1}};
		
		//printing 2D array
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}