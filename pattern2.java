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
class pattern2
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int n;
	    int i,j;
	    n = sc.nextInt();
	    int k = 1;
	    
	    for(i=0;i<n;i++){
	        for(j=n;j>i;j--){
	            System.out.print(k+" ");
	            k+=1;
	        }
	        k = 1;
	        System.out.println();
	    }
	}
}
