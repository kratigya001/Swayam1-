public class Find Outside Array {
    import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0){
		    int n=sc.nextInt();
		    int arr[]= new int [n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		        
		    }
		    helper(arr);
		}

	}
	public static void helper(int arr[]){
	    HashSet<Integer> hs= new HashSet<>();
	    for(int num: arr){
	        hs.add(num);
	    }
	    int len=arr.length;
	    for(int i=0;i<len;i++){
	        for(int j=0;j<len;j++){
	            if(i ==j) continue;
	            int total=arr[i]+arr[j];
	            if(!hs.contains(total)){
	                System.out.println(arr[i]+ " "+ arr[j]);
	                return;
	                
	                
	            }
	        }
	    }
	        for(int i=0;i<len;i++){
	            int total=arr[i]+arr[i];
	            if(!hs.contains(total)){
	                System.out.println(arr[i]+" "+ arr[i]);
	                return;
	            }
	        }
	    System.out.println(-1);
	    
	}
	
}
    
}
