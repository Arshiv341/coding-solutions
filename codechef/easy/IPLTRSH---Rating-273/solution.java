import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int s = sc.nextInt();
		    int ti = sc.nextInt();
		    if(s-ti>0){
		        System.out.println(s-ti);
		    }
		    else{
		        System.out.println(0);
		    }
		    
		}

	}
}
