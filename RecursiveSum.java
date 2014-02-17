// RecursiveSum.java, unit 5.1.11

/** 
 *  This class contains the method recursiveSum, which accepts an array of integers and 
 * 	the size of the array as its only two arguments, and recursively calculates the sum 
 *	of all the integers in the array. It also prints out the sum of elements in four test arrays.
 *
 *  @author:  Anna Ntenta, anna.ntenta@gmail.com
 *  @version: Last Modified February 17, 2014
 */

import java.util.*;

class RecursiveSum 
{
	/**
    * This method takes an array of integers and the size of the array as input 
 	* and returns the sum of all the integers in the array.
    *
    * @param   arr  Array of integers
    * @param   int  Size of array
    * @return  int	The sum of the integers in the array
    */	
	public static int recursiveSum(int [] arr, int size)
	{
		// if array is empty
		if (size <= 0)
			return 0;

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
		// tests
		int [] a = {1, 1, 1, 1};
	 	int [] b = {42};
	 	int [] c = {};
	 	int [] d = {10, -5};

	 	System.out.println();
	 	System.out.println("The sum of the numbers [1, 1, 1, 1] is: " + recursiveSum(a, a.length));
	 	System.out.println("The sum of the numbers [42] is: " + recursiveSum(b, b.length));
	 	System.out.println("The sum of the numbers [] is: " + recursiveSum(c, c.length));
	 	System.out.println("The sum of the numbers [10, -5] is: " + recursiveSum(d, d.length));
	 	System.out.println();
	}

}

