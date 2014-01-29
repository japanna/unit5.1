/** mystery.java
 *  unit 5.1.1
 *
 *  @author:  Anna Ntenta
 *  @version: Last Modified January 29, 2014
 */

import java.util.*;

public class mystery {

public static void mystery (int [] a, int [] b)
{
	for (int i = 0; i < a.length; i++)
		a [i] += b [b.length - 1 - i];
}

public static void main (String[] args)
{
	int [] a1 = {1,3,5,7,9};
	int [] a2 = {1,4,9,16,25};
	mystery (a1, a2);
	System.out.println(Arrays.toString(a1));
}
}