import java.util.Scanner;

public class ApartmentPopulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of floors: ");
        int floors = sc.nextInt();

        int[][][] apartment = new int[floors][][];

        int totalPersons = 0;

        for (int i = 0; i < floors; i++) {
            System.out.print("Enter the number of houses on floor " + (i + 1) + ": ");
            int houses = sc.nextInt();

            apartment[i] = new int[houses][];

            for (int j = 0; j < houses; j++) {
                System.out.print("Enter the number of persons in house " + (j + 1) + " on floor " + (i + 1) + ": ");
                int persons = sc.nextInt();

                apartment[i][j] = new int[1];
                apartment[i][j][0] = persons;

                totalPersons += persons;
            }
        }

        System.out.println("\nTotal number of persons in the apartment: " + totalPersons);

        System.out.println("\nApartment details:");
        for (int i = 0; i < floors; i++) {
            System.out.println("Floor " + (i + 1) + ":");
            for (int j = 0; j < apartment[i].length; j++) {
                System.out.println("  House " + (j + 1) + " has " + apartment[i][j][0] + " persons.");
            }
        }
    }
}
