//Java Program to Find the Area of Square, Rectangle and Circle using Method Overloading
public class Method
{
    //Driver Code
    public static void main(String[] args)
    {
        Rectangle obj = new Rectangle();
        obj.Area(30, 20);
        obj.Area(12.5, 4.5);
        Circle obj1 = new Circle();
        obj1.Area(3);
        obj1.Area(5.5);
        Square obj2 = new Square();
        obj2.Area(20);
        obj2.Area(5.2);
        
    }
}
class Square 
{
    void Area(double side)
    {
        System.out.println("Area of the Square 2: "+ side * side);
    }
    void Area(float side)
    {
        System.out.println("Area of the Square 1: "+ side * side);
    }
}
class Circle 
{
    static final double PI = Math.PI;
  
    void Area(double r)
    {
        double A = PI * r * r;
  
        System.out.println("The area of the circle 2 is :" + A);
    }
  
    void Area(float r)
    {
        double A = PI * r * r;
  
        System.out.println("The area of the circle 1 is :" + A);
    }
}
class Rectangle 
{
    void Area(double l, double b)
    {
        System.out.println("Area of the rectangle 2: " + l * b);
    }
    void Area(int l, int b)
    {
        System.out.println("Area of the rectangle 1: " + l * b);
    }
}