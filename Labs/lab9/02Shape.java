import java.util.Scanner;

interface Shape {

    double getArea();
}

class Rectangle implements Shape {

    int Length, Breadth;

    public Rectangle(int Length, int Breadth) {
        this.Length = Length;
        this.Breadth = Breadth;
    }

    @Override
    public double getArea() {
        return Length * Breadth;
    }
}

class Circle implements Shape {

    int Radius;

    public Circle(int Radius) {
        this.Radius = Radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Radius * Radius;
    }
}

class Triangle implements Shape {

    int hOfTri, base;

    public Triangle(int hOfTri, int base) {
        this.hOfTri = hOfTri;
        this.base = base;
    }

    @Override
    public double getArea() {
        return 0.5 * hOfTri * base;
    }
}

public class _02shape {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length and breadth of rectangle: ");
        int Length = sc.nextInt();
        int Breadth = sc.nextInt();
        Shape s1 = new Rectangle(Length, Breadth);

        System.out.print("Enter Radius: ");
        int Radius = sc.nextInt();
        Shape s2 = new Circle(Radius);

        System.out.print("Enter height and base: ");
        int hOfTri = sc.nextInt();
        int base = sc.nextInt();
        Shape s3 = new Triangle(hOfTri, base);

        System.out.println("Area of Rectangle " + s1.getArea());
        System.out.println("Area of Circle " + s2.getArea());
        System.out.println("Area of Triangle " + s3.getArea());
    }
}
