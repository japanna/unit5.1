/** LowestGrade.java
 *  unit 5.1.6
 *  
 *  @author:  Anna Ntenta
 *  @version: Last Modified January 29, 2014
 */

/** 
 *  removeLowest accepts a variable number of integer arguments 
 *  that represent the homework scores of a single student and
 *  returns an array with all the scores except the lowest one.
 *
 *  @param   arrayIn    An array of integers
 *  @return  arrayOut   An array that contains all of the values 
 *						passed to the method EXCEPT for the lowest score.
 */
import java.util.*;

class LowestGrade
{

private static int [] removeLowest (int... args)
{
	if (args.length != 0)
	{
	
	int [] arr = new int [args.length];
	int arrIndex = 0;
    for (int arg : args)
    {
    	arr[arrIndex] = arg;
    	arrIndex++;
    }

    if (args.length == 1)
		{
			return arr;
		}

	// this int will hold the index of the lowest score
	int lowestIndex = 0;
	// this array will contain all scores except the lowest
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
	return highScores;
}
else
{
	int [] highScores = new int [0];
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
 	int [] b = removeLowest ( 85, 1 );
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