import java.util.Scanner;

class Complex {
    int real;
    int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void addition(int real, int imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void display() {
        System.out.println("Ans " + this.real + " + " + this.imaginary + "i");
    }
}

public class _05Complex {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter for first number: ");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        System.out.println("Enter for second number: ");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        Complex c1 = new Complex(r1, i1);
        c1.addition(r2, i2);
        c1.display();
    }
}
