import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		    int x= sc.nextInt();
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    if(x<=(a+(b*2))){
		        System.out.println("QUALIFY");
		    }
		    else{
		        System.out.println("NOTQULIFY");
		    }
		}

	}
}
