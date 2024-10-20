// 5.	Write a java program to calculate the area and perimeter of the triangle using an interface.
import java.util.Scanner;
import java.lang.Math;

// Interface for calculating the area and perimeter
interface TriangleCalculations 
{
    double calculateArea();
    double calculatePerimeter();
}
// Class implementing the interface
class Triangle implements TriangleCalculations 
{
    double a,b,c;
    double s,area,perimeter;
    // Constructor
   Triangle(double a, double b, double c) 
	{
        	this.a = a;
        	this.b = b;
        	this.c = c;
    	}
    // Method to calculate the area of the triangle
    @Override
     public double calculateArea() 
	{
        // Using Heron's formula: Area = sqrt(s * (s - a) * (s - b) * (s - c))
        	double s = (a + b + c) / 2;
		
        	return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    	}

    // Method to calculate the perimeter of the triangle
    @Override
    public double calculatePerimeter() 
	{
        	return a+b+c;
    	}
}
class TAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Getting the sides of the triangle from the user
        System.out.print("Enter the length of the first side: ");
        double a = sc.nextDouble(); 
        System.out.print("Enter the length of the second side: ");
        double b = sc.nextDouble();        
        System.out.print("Enter the length of the third side: ");
        double c = sc.nextDouble();
        // Creating a Triangle object
        Triangle t = new Triangle(a, b, c);  
        // Calculating and displaying the area and perimeter
        System.out.println("Area of the triangle: " + t.calculateArea());
        System.out.println("Perimeter of the triangle: " + t.calculatePerimeter());
        sc.close();
    }
}

