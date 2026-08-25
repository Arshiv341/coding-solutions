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
		    int buy = sc.nextInt();
		    int shell = sc.nextInt();
		    if(buy>shell){
		        System.out.println("LOSS");
		    }
		    else if(buy==shell){
		        System.out.println("NEUTRAL");
		    }
		    else{
		        System.out.println("PROFIT");
		    }
		}

	}
}
