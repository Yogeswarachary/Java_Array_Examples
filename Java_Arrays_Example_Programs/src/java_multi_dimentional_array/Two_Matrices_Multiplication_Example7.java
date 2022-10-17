package java_multi_dimentional_array;

import java.util.Arrays;

public class Two_Matrices_Multiplication_Example7 {
	public static void main(String[] args) {
		//declaring two matrices
		int a[][]= {{3,5,7},{2,4,6},{9,3,6}};
		int b[][]= {{1,5,9},{2,5,2},{7,1,3}};
		
		//declaring the result matrix
		int c[][]=new int[3][3];
		
		//using for loop we can do the matrix multiplication
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=0;
				for(int k=0;k<3;k++) {
					c[i][j]=a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}

class SortArray{
	public static void main(String[] args) {
		int arr[]= {1,4,3,6,8,9,0};
		System.out.println("Before sorting...");
		for(int a:arr) {
			System.out.println(a);
		}
		//sorting array
		Arrays.sort(arr);
		System.out.println("After sorting...");
		for(int a:arr) {
			System.out.println(a);
		}
	}
}

class CopyArray{
	public static void main(String[] args) {
		char copyFrom[]= {'A','B','H','a','R','G','A','V','I'};
		char copyTo[]=new char[8];
		System.arraycopy(copyFrom, 1, copyTo, 0, 8);
		System.out.println(String.valueOf(copyTo));
	}
}

class CloneArray{
	public static void main(String[] args) {
		System.out.println("Main array");
		char name[]= {'A','B','H','a','R','G','A','V','I'};
		for(char c:name) {
			System.out.print(c+" ");
		}
		System.out.println("\nclone array");
		char clonearr[]=name.clone();
		for(char ch:clonearr) {
			System.out.print(ch);
		}
		
	}
}

class Returning_Array_From_Method{
	//method
	static int[] get() {
		return new int[] {1,2,3,4,5,6};
	}
	public static void main(String[] args) {
		int arr[]=get();
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}
}