import java.util.*;
import java.lang.*;

public class bubblesort
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter number of elements..");
	    int n=s.nextInt();
	    int []a=new int[n];
	    int temp;
	    System.out.println("enter numbers....");
	    for (int i=0;i<n;i++)
	    {
	        a[i]=s.nextInt();
	    }
	    for(int j=0;j<n;j++)
	    {
	    for(int i=0;i<n-1;i++)
	    {
	        if(a[i]>a[i+1])
	        {
	            temp=a[i];
	            a[i]=a[i+1];
	            a[i+1]=temp;
	        }
	    }
	    }
	    for(int i=0;i<n;i++)
	    {
		System.out.println(a[i]);
	    }
	}
}
