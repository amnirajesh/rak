package rajraj;

import java.util.Scanner;

public class GreaterThan {
	public static void main(String[] args) {
		int a,b,c,d,f,e;
		Scanner rj=new Scanner(System.in);
		System.out.println("enter values");
		a=rj.nextInt();
		b=rj.nextInt();
		c=rj.nextInt();
		if(a>c) {
			if(a>b) {System.out.println("a is bigger" +a);}
			else {System.out.println("b is biggerr" +b);}	
		if(c>b&&a>c) {System.out.println("c is bigger"+c);}
		else {System.out.println("b is bigger"+b);
		}
}
	d=a%2;
	e=b%2;
	f=c%2;
	if(d==0) {System.out.println("a is odd ");}else {System.out.println("a is even ");}
	if(e==0){System.out.println("b is odd ");}else {System.out.println("b is even ");}
	if(f==0){System.out.println("c is odd ");}else {System.out.println("c is even ");}
		
			}}
