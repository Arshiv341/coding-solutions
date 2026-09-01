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
		    int x=0;
		    int n =sc.nextInt();
		    while(n!=0){
		        x=x*10 + (n%10);
		        n=n/10;
		    }
		    System.out.println(x);
		}

	}
}
