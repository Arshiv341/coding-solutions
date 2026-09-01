import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int count =0;
		int[] arr = new int[4];
		for(int i =0; i<4;i++){
		    arr[i]=sc.nextInt();
		    if(arr[i]<4){
		        count++;
		    }
		}
		if(count>=3){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
		
		

	}
}
