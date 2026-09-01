import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		     int n = sc.nextInt();
		     int p = sc.nextInt();
		     int c=0;
		     int[]arr=new int[n];
		     for(int i=0;i<n;i++){
		         arr[i]=sc.nextInt();
		         if(arr[i]>=p){
		             c++;
		         }
		     }
		     System.out.println(c);
		    
		}

	}
}
