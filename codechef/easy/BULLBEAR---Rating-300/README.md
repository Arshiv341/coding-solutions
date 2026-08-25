# BULLBEAR - Rating 300

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T21:43:32.394Z  

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
		int t = sc.nextInt();
		while(t-->0){
		    int[] arr = new int[3];
		    for(int i =0; i<3;i++){
		        arr[i]=sc.nextInt();
		    }
		    int max=arr[0];
		    for(int i =0; i<3;i++){
		        if(max<arr[i]){
		            max=arr[i];
		        }
		    }
		    int max2=Integer.MIN_VALUE;
		    for(int j =0; j<3;j++){
		        if(max2<arr[j] && arr[j]<max){
		            max2=arr[j];
		        }
		    }
		    System.out.println(max2);
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BULLBEAR)