import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x<3){
		    System.out.println("GOLD");
		}
		else if(x>=3 && x<6){
		    System.out.println("SILVER");
		}
		else{
		    System.out.println("BRONZE");
		}

	}
}
