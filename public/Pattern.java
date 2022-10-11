import java.io.*;
import java.util.*;

class Pattern
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j;
System.out.print("enter the number of rows");

int n=sc.nextInt(); //gets the number of lines to print

for( i=0;i<n;i++)
{
for(j=0;j<=i;j++)
{
System.out.print("*");
}
System.out.println("\n");
}
}
}
