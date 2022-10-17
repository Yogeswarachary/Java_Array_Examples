package java_single_dimention_arrays;

import java.util.Arrays;

public class Array_Cloning_Example6 {
	public static void main(String[] args) {
		int arr[]= {1,4,5,7,0,12,78};
		System.out.println("before sorting");
		//printing the normal array
		for(int a:arr) {
			System.out.println(a+" ");
		}
		//Sorting the above array
		Arrays.sort(arr);
		System.out.println("Sorted order of given array:-");
		//printing sorted array
		for(int a:arr) {
			System.out.println(a+" ");
		}
		
		//Array cloning
		int cloned[]=arr.clone();//built in method for cloning array
		System.out.println("Here is the cloning array...");
		//printing cloning array
		for(int i:cloned) {
			System.out.println(i+" ");
		}
	}
}
