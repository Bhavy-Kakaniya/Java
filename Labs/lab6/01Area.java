import java.util.Scanner;

class circle {
    double radius;

    public double area(double radius) {
        return Math.PI * radius * radius;
    }
}

public class _01area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        circle c1 = new circle();
        System.out.println(c1.area(radius));
    }
}
