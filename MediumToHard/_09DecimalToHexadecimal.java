
// convert hexaDec to hexadecimal and vice versa
import java.util.Scanner;

public class _09DecimalToHexadecimal {

    static void convertDecToHexaDec(int n) {
        int digit;
        String hexaDec = "";
        while (n > 0) {
            digit = n % 16;
            switch (digit) {
                case 10:
                    hexaDec = "A" + hexaDec;
                    break;
                case 11:
                    hexaDec = "B" + hexaDec;
                    break;
                case 12:
                    hexaDec = "C" + hexaDec;
                    break;
                case 13:
                    hexaDec = "D" + hexaDec;
                    break;
                case 14:
                    hexaDec = "E" + hexaDec;
                    break;
                case 15:
                    hexaDec = "F" + hexaDec;
                    break;
                default:
                    hexaDec = digit + hexaDec;
                    break;
            }
            n /= 16;
        }
        System.out.println("Decimal number is: " + hexaDec);
    }

    static void convertHexaToDec(String n) {
        int j = 0, sum = 0;
        for (int i = n.length() - 1; i >= 0; i--) {
            char currentDigit = n.charAt(i);
            switch (currentDigit) {
                case 'A':
                    sum += 10 * Math.pow(16, j);
                    break;
                case 'B':
                    sum += 11 * Math.pow(16, j);
                    break;
                case 'C':
                    sum += 12 * Math.pow(16, j);
                    break;
                case 'D':
                    sum += 13 * Math.pow(16, j);
                    break;
                case 'E':
                    sum += 14 * Math.pow(16, j);
                    break;
                case 'F':
                    sum += 15 * Math.pow(16, j);
                    break;
                default:
                    sum += (int) (currentDigit - '0') * Math.pow(16, j);
                    break;
            }
            j++;
        }
        System.out.println("Decimal number is " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter decimal number: ");
        int dec = sc.nextInt();
        convertDecToHexaDec(dec);

        System.out.println("Enter hexa hexaDec number: ");
        String hexaDec = sc.next();
        convertHexaToDec(hexaDec);

    }
}
