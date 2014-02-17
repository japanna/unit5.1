// Binomial.java, unit 5.1.10

/** 
 *  This class contains the method binomial, which takes two integers, n and k, 
 *  as arguments and calculates their binomial coefficient. It also prints the 
 *  first n rows of Pascal's Triangle.
 *
 *  @author:  Anna Ntenta, anna.ntenta@gmail.com
 *  @version: Last Modified February 17, 2014
 */

import java.util.*;

class Binomial
{
	/**
    * This method takes two integers as arguments and returns their binomial 
 	* coefficient.
    *
    * @param   n  		An integer >= 0
    * @param   k  		An integer >= 0
    * @return  C(n,k)	Binomial coefficient
    */	
	public static int binomial(int n, int k)
	{
		// base case #1
		if (k == 0) return 1;
		//base case #2
		if (k > n) return 0;

		// recursive case
		return (binomial(n - 1, k) + binomial(n - 1, k - 1));
	}

	public static void main (String [] args)
	{
		// create Scanner object
		Scanner in = new Scanner (System.in);

		System.out.println ("Let's make a Java's Triangle!");
		System.out.print ("Please give us an integer: ");

		// make sure that user provided an integer
		if(in.hasNextInt()) {

			int n = in.nextInt();
			// binomial coefficients only defined for n, k >= 0
			if (n >= 0) {
				System.out.println();
				// n number of rows in triangle
				for (int i = 0; i <= n; i++)
				{
					// k number of columns, k <= n
					for (int j = 0; j <= i; j++) 
					{
						System.out.print(binomial(i, j) + " ");
					}
					System.out.println();
				}
				System.out.println();
			}
			// error message if n < 0
			else {
				System.out.println ("\nPlease start over and give us an integer >= 0.\n");
			}
		}
		else {
				System.out.println ("\nThat's not an integer. Please start over.\n");
		}
	}
}
