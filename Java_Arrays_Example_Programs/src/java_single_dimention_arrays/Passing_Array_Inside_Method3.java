package java_single_dimention_arrays;

import java.util.Arrays;

public class Passing_Array_Inside_Method3 {
	
	//Creating a method which receives an array as a parameter
	static void min(int arr[]) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(min);

	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};//declaring and initializing an array 
		min(a);//passing array to method
	}
}
