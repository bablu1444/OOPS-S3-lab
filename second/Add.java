import java.io.*;
import java.util.*;

class Sum
{
int m;
int n;
    void pep()
    {
        float a= m+n;
        System.out.println("Sum is: "+a);
    }
}
class Add
{
 public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     Sum s1=new Sum();
     System.out.print("Enter number 1: \n");
     s1.length=sc.nextInt();
     System.out.print("Enter number 2: \n");
     s1.breadth=sc.nextInt();
 
        s1.pep();
    }   
}