package java_single_dimention_arrays;

import java.util.Arrays;

public class Array_Sorting_Example4 {
	public static void main(String[] args) {
		String arr[]= {"Iman","Harman","Sansui","Samsung"};
		System.out.println("The original array is:- ");
		for(String a:arr) {
			System.out.println(a+" ");
		}
		Arrays.sort(arr);
		System.out.println("After sorting");
		for(String a:arr) {
			System.out.println(a+" ");
		}
	}
}
