package java_multi_dimentional_array;

public class Copying_Array_Elements2 {
	public static void main(String[] args) {
		//Declaring a source array
		char[] copyfrom= {'Y','O','G','E','S','W','A','R','A','C','H','A','R','Y'};
		
		//Declaring the destination array
		char[] copyTo=new char[9];
		
		//copying array using system.arraycopy() method
		System.arraycopy(copyfrom, 3, copyTo, 0, 5);
		
		//printing the destination array
		System.out.println(String.valueOf(copyTo));
		
	}
}
