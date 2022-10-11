import java.io.*;
import java.util.*;

class Factorial
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.print("enter the number to find factorial");

int a=sc.nextInt();
int fact=1;

	for(int i=1;i<=a;i++)
	fact*=i;



System.out.print("The factorial is:"+fact	);
}
}
