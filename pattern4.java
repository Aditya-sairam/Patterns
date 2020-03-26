/*5
  4 5
  3 4 5
  2 3 4 5
  1 2 3 4 5*/
  /* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pattern4
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int n;
	    int i,j;
	    n = sc.nextInt();
	    int k = n;
	    //System.out.println(n);
	    for(i=0;i<n;i++){
	        int x = k;
	        for(j=0;j<=i;j++){
	            System.out.print(x+" ");
	            x++;
	        }
	        k--;
	        System.out.println();
	    }
	}
}
