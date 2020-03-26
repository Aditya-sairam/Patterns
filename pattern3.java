/*5
  4 4
  3 3 3
  2 2 2 2
  1 1 1 1 1*/
  import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pattern3
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
	        for(j=0;j<=i;j++){
	            System.out.print(k+" ");
	        }
	        k--;
	        System.out.println();
	    }
	}
}
