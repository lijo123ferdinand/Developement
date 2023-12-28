package javademo;
import java.io.*;
import java.util.Scanner;
public class Hello {
	static Scanner scanner=new Scanner(System.in);

	public static void main(String[]args) {
		
		int con=scanner.nextInt();
		while(con==1) {
		
		System.out.println("enter the string to rev");
		String torev=scanner.next();
		String actual=torev;
		StringBuilder rev=null;
		StringBuilder df=new StringBuilder(actual);
		rev=df.reverse();
		System.out.println(rev);
		con=2;
		int gum=scanner.nextInt();
		 con=gum;
		
	}

}}
