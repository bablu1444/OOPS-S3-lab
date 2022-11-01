import java.io.*;
import java.util.*;

class RectangleArea
{
int length;
int breadth;
    void area()
    {
        int a= length*breadth;
        System.out.println("Area is: "+a);
    }
}
class Arearec
{
 public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     RectangleArea r1=new RectangleArea();
     System.out.print("Enter length \n");
     r1.length=sc.nextInt();
     System.out.print("Enter length \n");
     r1.breadth=sc.nextInt();
 
        r1.area();
    }   
}