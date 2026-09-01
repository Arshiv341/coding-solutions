# QUALIFY - Rating 593

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-01T22:11:12.599Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new  Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int x = sc.nextInt();
		    if(x%4==0){
		        System.out.println("GOOD");
		    }
		    else{
		        System.out.println("NOT GOOD");
		    }
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QUALIFY)