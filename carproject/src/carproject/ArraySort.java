package carproject;

import java.util.Arrays;
public class ArraySort {
	public static void main(String[] args) {
		int array[] = {1,21,2,33,9};
		Arrays.sort(array);
		for(int i = array.length -1 ;i>=0;i--) {
			System.out.print(array[i]+" ");
//			System.out.println(i);
		}
	}
}
