import java.util.Scanner;

class Square {
    double side;

    public double areaOfSquare(double side) {
        return side * side;
    }
}

class Rectangle {
    double length;
    double breadth;

    public double areaOfRectangle(double length, double breadth) {
        return length * breadth;
    }
}

class Circle {
    double radius;

    public double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }
}

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for square, 2 for rectangle, 3 for circle");
        int x = sc.nextInt();
        if (x == 1) {
            System.out.println("Enter side of square: ");
            double side = sc.nextDouble();
            Square s1 = new Square();
            System.out.println("Area is " + s1.areaOfSquare(side));
        }
        if (x == 2) {
            System.out.println("Enter length of rectangle: ");
            double length = sc.nextDouble();
            System.out.println("Enter breadth of rectangle: ");
            double breadth = sc.nextDouble();
            Rectangle r1 = new Rectangle();
            System.out.println("Area is " + r1.areaOfRectangle(length, breadth));
        }
        if (x == 3) {
            System.out.println("Enter radius of circle: ");
            double radius = sc.nextDouble();
            Circle c1 = new Circle();
            System.out.println("Area is " + c1.areaOfCircle(radius));
        }
    }
}
