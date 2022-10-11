//import java.io.*;
import java.util.*;

class BinaryCheck
{


public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.print("enter the number to check binary or not");

int num=sc.nextInt(); //gets the number to check
int check=1;


for(int h=0;h!=0;h++)
{
int a=num%10;

if (a%10==0||a%10==1)
{check=4;
a/=10;


else

{


System.out.print("The given number is Not Binary");

}	
}

if(check==4)
System.out.print("The given number is Binary");


//System.out.print("The given number is Not Binary");

}
}}
