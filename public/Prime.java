import java.io.*;
import java.util.*;

class Prime
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.print("enter the number to check primeor composite \n");

int a=sc.nextInt();
int count=0;
for(int i=1;i<a;i++)
	{
	if(a%i==0)
	count++;
	}
	if(count==2)
	System.out.print("The number is prime");
	else
	System.out.print("The number is composite");
}
}
