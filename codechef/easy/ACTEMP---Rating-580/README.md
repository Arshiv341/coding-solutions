# ACTEMP - Rating 580

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-01T16:49:42.118Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int[] arr=new int[n];
		    int c=0;
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		        if(arr[i]>=1000){
		            c++;
		        }
		    }
		    System.out.println(c);
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ACTEMP)