import java.util.Scanner;

class circle {
    double radius = 0;

    circle(double radius) {
        this.radius = radius;
    }

    public double areaOfCircle() {
        double area = 3.14 * radius * radius;
        return area;
    }
}

public class function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        double radius = sc.nextDouble();
        circle c1 = new circle(radius);
        double area = c1.areaOfCircle();
        System.out.println(area);
    }
}
