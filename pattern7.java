/*1 2 3 4 5
  1 2 3 4
  1 2 3
  1 2
  1*/
  /* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int n;
	    n = sc.nextInt();
	    int mat[][] = new int[n][n];
	    
	    int i,j;
	    
	    
	    for(i=0;i<n;i++){
	        int k = 1;
	        for(j=n-1;j>=i;j--){
	            System.out.print(k+" ");
	            k++;
	        }
	        System.out.println();
	}
}
}

