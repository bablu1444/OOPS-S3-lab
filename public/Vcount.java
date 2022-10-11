import java.io.*;
import java.util.*;

//java program to count vowels in a string

class Vcount
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.print("enter the string to count the number of vowels \n");
String a=sc.nextLine();

int vow=0;
int pos=0;

	for(pos=0;pos<a.length();pos++)
	if(a.charAt(pos)=='a'||a.charAt(pos)=='e'||a.charAt(pos)=='i'||a.charAt(pos)=='o'||a.charAt(pos)=='u')
	{
	vow++;
	}
	
	System.out.print("The given string "+a+" has "+vow+ " vowels in it");
}
}


