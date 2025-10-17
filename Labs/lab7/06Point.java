import java.util.Scanner;

class Point {
    int x, y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Point point) {
        return Math.pow(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2), 0.5);
    }
}

class _07Point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter point 1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter point 2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        System.out.println(p1.distance(p2));
    }
}
