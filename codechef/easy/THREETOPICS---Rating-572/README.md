# THREETOPICS - Rating 572

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-01T15:51:30.117Z  

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
		int t= sc.nextInt();
		while(t-->0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int x1 = sc.nextInt();
		    int y1 = sc.nextInt();
		    if(x<=x1 && y<=y1){
		        System.out.println("POSSIBLE");
		    }
		    else{
		        System.out.println("IMPOSSIBLE");
		    }
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/THREETOPICS)