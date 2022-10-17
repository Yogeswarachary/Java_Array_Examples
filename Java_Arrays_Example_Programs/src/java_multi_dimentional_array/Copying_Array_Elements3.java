package java_multi_dimentional_array;

public class Copying_Array_Elements3 {
	public static void main(String[] args) {
		//creating the source array
		char[] copyFrom= {'1','3','9','6','7','6','1','0','6','8','0','2','3'};
		//destionation array
		char[] copyTo=new char[10];
		//copying array elements using system.arraycopy() method
		System.arraycopy(copyFrom, 2, copyTo, 0, 10);
		//printing the copied array or copyTo array
		System.out.println(String.valueOf(copyTo));
	}
}
