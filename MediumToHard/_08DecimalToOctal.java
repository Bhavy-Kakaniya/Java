
// convert decimal to octal
import java.util.Scanner;

public class _08DecimalToOctal {

    static void convertToOctal(int decimal) {
        String octal = "";
        while (decimal > 0) {
            octal = decimal % 8 + octal;
            decimal /= 8;
        }
        System.out.println("Octal number is : " + octal);
    }

    static void convertToDecimal(int octal) {
        int sum = 0, i = 0, digit;
        while (octal > 0) {
            digit = octal % 10;
            sum += digit * Math.pow(8, i);
            octal /= 10;
            i++;
        }
        System.out.println("Decimal number is: " + sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal number: ");
        int decimal = sc.nextInt();
        convertToOctal(decimal);
        System.out.println("Enter octal number: ");
        int octal = sc.nextInt();
        convertToDecimal(octal);
    }
}
