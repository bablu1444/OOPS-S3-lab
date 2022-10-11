import java.io.*;
import java.util.*;

class Fact
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.print("enter the number of terms");

int a=sc.nextInt();
double fact=1;

	for(int i=1;i<=a;i++)
	fact*=i;



System.out.print("The fibonacci is:"+fact	);
}
}
