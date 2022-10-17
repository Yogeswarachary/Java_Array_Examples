package java_single_dimention_arrays;

import java.util.Arrays;

public class Array_Sorting_Example5 {
	public static void main(String[] args) {
		//Declaring and initializing the array
		int arr[]= {13,12,445,45,78,988,01};
		System.out.println("Before sorting:- ");
		for(int a:arr) {
			System.out.println(a+" ");
		}
		//array sort method by default prints Ascending order
		Arrays.sort(arr);
		System.out.println("After sorting:-");
		//this loop is for sorting the data
		for(int a:arr) {
			System.out.println(a+" ");
		}
	}
}
