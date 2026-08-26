import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr= new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int ev =0;
		int od=0;
		for(int i =0; i<n;i++){
		    if(arr[i]%2==0){
		        ev++;
		    }
		    else{
		        od++;
		    }
		}
		if(ev>od){
		    System.out.println("READY FOR BATTLE");
		}
		else{
		    System.out.println("NOT READY");
		}

	}
}
