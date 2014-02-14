/** RecursiveSum.java
 *  Unit 5.1.11
 *
 *  @author:  Anna Ntenta
 *  @version: Last Modified February 14, 2014
 */

import java.util.*;

class RecursiveSum 
{
	public static int recursiveSum(int [] arr, int size)
	{
		// base case
		if (size == 1)
		{
			return arr[0]; 	
		}
		// recursive case
		else			
		{	
    		int sum = arr[size - 1]; 
    		return sum + recursiveSum(arr, size - 1); 
		}
	}

	public static void main (String [] args) {
		int arr [] = {8,2, 1,1};
		int n = recursiveSum(arr, arr.length);
		System.out.println(n);
	}

}

