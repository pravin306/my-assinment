package assignment;

import java.util.Iterator;

public class Isprime {
	public static void main(String[] args) {
		
		int n=13;
		int count=0;
		
//		for(int i=2; i<=n;i++) 
//		{
//			
//			if(n%i==0) 
//			{
//				System.out.println("The number " is a Prime");
//			
//			}else 
//			
//			{
//				System.out.println("The number  is not a prime");
//						}
		for(int i = 2; i < n-1; i++) {
			if(i%2==0)
			{count=1;
			
			}
	
}
	if(count==0)
	{
		System.out.println("the number is prime");
		
	}else
	{
		System.out.println("the number is not prime");
	}
}
}

