/*1 1 1 1 1
  2 2 2 2
  3 3 3
  4 4 
  5*/
  import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pattern1
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int n;
	    n = sc.nextInt();
	    int k = 1;
	    
	    for(i=0;i<n;i++){
	        for(j=n-1;j>=0;j--){
	            System.out.print(k);
	        }
	        k+=1;
	        System.out.println();
	    }
	}
}
