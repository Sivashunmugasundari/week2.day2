package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// input
		int[] arr = {1,2,3,4,7,6,8};
		// Sort the array
		Arrays.sort(arr);
		for (int i=1;i<arr.length;i++) {
			if ( arr[i] - arr[i-1] == 1 ) 
			{
			} 
			else 
			{
				System.out.println( "Missing Element is " + ( arr[i-1] + 1 ) );
			}        
		}

	}

}
