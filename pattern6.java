/* package codechef; // don't place package name! */
/*5 5 5 5 5
  4 5 5 5 5
  3 4 5 5 5
  2 3 4 5 5
  1 2 3 4 5*/
  

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
	    int k = n;
	    
	    for(i=0;i<n;i++){
	        int x = k;
	        for(j=0;j<=i;j++){
	            mat[i][j] = x;
	            x++;
	            }
	           
	        k--;
	    }
	    for(i=0;i<n;i++){
	        for(j=0;j<n;j++){
	            if(mat[i][j] == 0){
	                mat[i][j] = 5;
	            }
	        }
	    }
	     for(i=0;i<n;i++){
	        for(j=0;j<n;j++){
	            System.out.print(mat[i][j]+" ");
	    }
	    System.out.println();
	     }
	}
}

