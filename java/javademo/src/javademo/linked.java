package javademo;
import java.util.*;
public class linked 
{
	public static void main(String []args) {
		List <Integer>l1=new LinkedList<>();
		List <Integer>l2=new LinkedList<>();
		l1.add(1);
		l1.add(3);
		l1.add(5);
		l2.add(6);
		l2.add(7);
		l2.add(9);
		int sum =0;
	System.out.println(l1);
	for(int n:l1) {
	  sum+=n;
	  
	  System.out.println(sum);
	}
	
	}
}
