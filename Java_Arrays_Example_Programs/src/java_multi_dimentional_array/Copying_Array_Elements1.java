package java_multi_dimentional_array;

public class Copying_Array_Elements1 {
	public static void main(String[] args) {
		
		//Declaring a source array
		char[] copyfrom= {'A','B','C','D','E','F','G','H','I'};
		
		//Declaring a destination array
		char[] copyTo=new char[7];
		
		//copying array using System.arraycopy() method
		System.arraycopy(copyfrom, 1, copyTo, 0, 5);
		
		//printing the destination array
		System.out.println(String.valueOf(copyTo));
	}
}
