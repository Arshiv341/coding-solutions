# SST - Rating 588

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-01T20:30:53.699Z  

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

```

---

[View on CodeChef](https://www.codechef.com/problems/SST)