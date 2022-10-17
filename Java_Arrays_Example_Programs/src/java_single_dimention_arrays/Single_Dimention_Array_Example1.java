package java_single_dimention_arrays;

public class Single_Dimention_Array_Example1 {
	public static void main(String[] args) {
		
		int a[]=new int[6];//declaring and declaring array
		a[0]=10;//initialization
		a[1]=11;
		a[2]=15;
		a[3]=13;
		a[4]=9;
		a[5]=7;
		
		//traversing array
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
