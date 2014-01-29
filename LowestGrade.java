/** LowestGrade.java
 *  unit 5.1.6
 *  
 *  @author:  Anna Ntenta
 *  @version: Last Modified January ___________, 2014
 */


import java.util.*;

class LowestGrade
{

/** 
 *  removeLowest accepts a variable number of integer arguments 
 *  that represent the homework scores of a single student and
 *  returns an array with all the scores except the lowest one.
 *
 *  @param   args    	 a variable number of integers
 *  @return  highScores  An array that contains all of the values 
 *						 passed to the method EXCEPT for the lowest score.
 */
private static int [] removeLowest (int... args)
{
	// if the method is given no arguments
	if (args.length == 0)
	{
		// return an empty array
		int [] highScores = new int [0];
		return highScores;
	}

	else 

	{
		// initiate an array with the length equal to no of arguments
		int [] arr = new int [args.length];
		// counter for array
		int arrIndex = 0;
		// put each argument in the array
	    for (int arg : args)
	    {
	    	arr[arrIndex] = arg;
	    	arrIndex++;
	    }
	    // if given only one argument the one score is kept
	    if (args.length == 1)
		{
			return arr;
		}

		// int to hold the index of the lowest score
		int lowestIndex = 0;
		// array to contain all scores except the lowest
		// it will be one shorter than the original array
		int [] highScores = new int [arr.length - 1];
		// find the index of the lowest score
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] < arr[lowestIndex])
				lowestIndex = i;
		}
		// counter for placement of scores in new array
		int newArrCounter = 0; 
		// put all scores except lowest in new array
		for (int j = 0; j < arr.length; j++)
		{
			if (j != lowestIndex)
			{
				highScores[newArrCounter] = arr[j];
				newArrCounter++;
			}
		}
		// return array of scores except the lowest
		return highScores;
	}
}

/** 
 *  arrayPrint accepts an array of integers and prints it out as a string 
 *
 *  @param   arrayIn    An array of integers
 *  @return  String   	A string containing the same integers
*
*private static String arrayPrint (int [] arr)
*{
*
*}
 */

public static void main (String [] args)
{
	int [] a = removeLowest ( 23, 90, 47, 55, 88);
 	int [] b = removeLowest ( 85);
 	int [] c = removeLowest ();
 	int [] d = removeLowest (59, 92, 93, 47, 88, 47);

 	System.out.println("a = " + Arrays.toString(a));
 	System.out.println("a = " + Arrays.toString(b));
 	System.out.println("a = " + Arrays.toString(c));
 	System.out.println("a = " + Arrays.toString(d));
 	//System.out.println("b = " + arrayPrint(b));
 	//System.out.println("c = " + arrayPrint(c));
 	//System.out.println("d = " + arrayPrint(d));
}
}