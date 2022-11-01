//Java Program to add diffrent number using Method Overloading

class Rectangle 
{
    void Area(double l, double b)
    {   double w=l+b;
        System.out.println("sum of no.2: " + w);
    }
    void Area(int l, int b)
    { int q=l+b;
        System.out.println("Sum of No.1: " + q);
    }
}

class Addtest
{
   
     //Driver Code
     public static void main(String[] args)
        {
            Rectangle obj = new Rectangle();
            obj.Area(30, 20);
            obj.Area(12.5, 4.5);
            
        }
    
}
