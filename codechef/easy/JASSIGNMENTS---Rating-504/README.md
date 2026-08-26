# JASSIGNMENTS - Rating 504

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T18:54:55.938Z  

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
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int v = n/6;
		    int r = n%6;
		    if(r!=0){
		        v=v+1;
		    }
		    System.out.println(v*x);
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/JASSIGNMENTS)