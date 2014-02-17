// Rabbits.java, unit 5.1.7

/**
 *  This class contains the method fibo, which takes one argument (a 
 *  number), and returns the n'th Fibonacci number.
 *
 *  @author:  Anna Ntenta, anna.ntenta@gmail.com
 *  @version: Last Modified February 17, 2014
 */

import java.util.*;

public class Rabbits
{
	/**
    * This method takes an integer as argument and returns the n'th 
    * Fibonacci number
    *
    * @param   n  	An integer
    * @return  fib	The n'th Fibonacci number
    */
	public static int fibo (int n)
	{
		// base case #1
		if (n <= 1) return 0;
		//base case #2
		if (n == 2) return 1;

		// recursive case
		return (fibo(n-1) + fibo(n-2));
	}

	public static void main (String [] args) {

		// print Fibonnaci numbers 1 - 12
		for (int i = 1; i <= 12; i++) 
		{
			int rabbit_pairs = fibo(i);
			System.out.println("At the end of month #" + i +", there are " + rabbit_pairs + " mature rabbit pairs.");
		}
	}
}

