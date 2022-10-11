//occurance of character in a word

import java.io.*;
import java.util.Scanner;
class Countc {
  {
    public static void main(String[] args) ;
    {
        Scanner scanner=new Scanner(System.in);
       
       
        System.out.println("Enter a string");
        String sot=scanner.nextLine();
        System.out.println("Enter a character");
        char che= scanner.next().charAt(0);
       
        int count=0;
       
       
       
        for(int i=0;i<sot.length();i++)
        {
        if (sot.charAt(i)==che)
        count++;
        }
        
        System.out.println("The number of "+che+ " in "+sot+" is "+count+".");
        
        }}
