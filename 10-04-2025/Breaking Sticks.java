package Swayam1-.10-04-2025;

public class Breaking Sticks {
    import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t= sc.nextInt();
		while( t-- >0){
		    int n=sc.nextInt();
		   // int []arr=new int[n];
		   int totalbreak=0;
		    for(int i=0;i<n;i++){
		        int length= sc.nextInt();
		    
		    if(length >1){
		        totalbreak+= length-1;
		    }
		    }
		    System.out.println(totalbreak);
		   
		}

	}
}

    
}
