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
		    int a = sc.nextInt();
		    int b =sc.nextInt();
		    int c = sc.nextInt();
		    if((a==1 && b==1)||(a==1 && c==1)||(b==1 && c==1)){
		        System.out.println("Not now");
		    }
		    else{
		        System.out.println("Water filling time");
		    }
		}

	}
}
