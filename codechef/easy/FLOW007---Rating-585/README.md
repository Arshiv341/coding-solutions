# FLOW007 - Rating 585

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-01T20:12:40.641Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int x = sc.nextInt();
		    if(x-1<100-x){
		        System.out.println("LEFT");
		    }
		    else{
		        System.out.println("RIGHT");
		    }
		    }

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FLOW007)