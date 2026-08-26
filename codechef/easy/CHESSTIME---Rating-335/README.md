# CHESSTIME - Rating 335

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T09:43:15.685Z  

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
		    int x = sc.nextInt();
		    if(x<=70){
		        System.out.println(0);
		    }
		    else if(x>70 && x<=100){
		        System.out.println(500);
		    }
		    else{
		        System.out.println(2000);
		    }
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CHESSTIME)