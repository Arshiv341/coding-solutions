import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int r1=sc.nextInt();
		int r2=sc.nextInt();
		int messi = (m1*2)+m2;
		int rondaldo=(r1*2)+r2;
		if(messi==rondaldo){
		    System.out.println("Equal");
		}
		else if(messi>rondaldo){
		    System.out.println("MESSI");
		}
		else{
		    System.out.println("RONALDO");
		}

	}
}
