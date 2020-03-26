/*1
  1 0
  1 0 1
  1 0 1 0
  1 0 1 0 1*/
  /* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pattern5
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int n;
	    n = sc.nextInt();
	    int i,j;
	    
	    for(i=0;i<n;i++){
	        for(j=0;j<=i;j++){
	            if(j%2 == 0){
	                System.out.print("1 ");
	            }
	            else{
	                System.out.print("0 ");
	            }
	        }
	        System.out.println();
	    }
	}
}
