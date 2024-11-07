import java.util.Scanner;

interface Shape {
    double calculateArea();
}

class Circle implements Shape{
  private double Radius;
  Circle(double r){
    Radius=r;
  }

 public double calculateArea(){
return Math.PI*Radius*Radius;

}
}

class Rectangle implements Shape{
private double length,breadth;
  Rectangle(double l,double b){
  length=l;
  breadth=b;
  
  }

 public double calculateArea(){
  return length*breadth;
  
  }


}
  
  class NPTEL{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test the Circle class
        // System.out.print("Enter the radius of the circle: ");
        double circleRadius = scanner.nextDouble();
        Circle circle = new Circle(circleRadius);
        System.out.println("Circle Area: " + circle.calculateArea());

        // Test the Rectangle class
        // System.out.print("Enter the length of the rectangle: ");
        double rectangleLength = scanner.nextDouble();
        // System.out.print("Enter the width of the rectangle: ");
        double rectangleWidth = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);
        System.out.print("Rectangle Area: " + rectangle.calculateArea());

        scanner.close();
    }
}