/*P         M
 R      A
   O  R
     G
  O    R
 R       A
P          M */

import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class zohopattern
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in); 
	    String str = sc.nextLine();
	    int i,j;
	    int k; 
	    int n = str.length(); 
	    int start = 0;
	    int end = n-1;
	    for(i=0;i<n;i++){
	        for(j=0;j<n;j++){
	            if(j == start && start != end){
	                System.out.print(str.charAt(start));
	               
	            }
	            else{
	                System.out.print(" ");
	            }
	            if(j == end && start != end){
	                System.out.print(str.charAt(end));
	            }
	            else{
	                System.out.print(" ");
	            }
	            if(start == end &&  i == j){
	                System.out.print(str.charAt(start));
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	        start++;
	        end--;
	        
	        
	    }
	    
	    
	}
}
