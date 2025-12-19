// angle between hands of hour and minute hand in clock 
import java.util.Scanner;

public class _07AngleBetweenHands {
    static void findAngle(int hours, int minutes) {

        // angle hands covers in one minute
        int minDegree = 6;
        int hourDegree = 30;

        // calculate angle between hands
        double angle = Math.abs(minDegree * minutes - (hourDegree * hours + hourDegree * 0.5));
        System.out.println("Angle between hour's and minute's hand is: " + angle);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int hours = sc.nextInt();
        System.out.print("Enter minutes: ");
        int minutes = sc.nextInt();

        findAngle(hours, minutes);
    }
}
