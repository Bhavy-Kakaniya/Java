import java.io.*;
import java.util.Scanner;

class Student implements Serializable {
    int rollNo;
    String name;
    double marks;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks;
    }
}

public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of students: ");
            int n = sc.nextInt();
            sc.nextLine();

            FileOutputStream fos = new FileOutputStream("students.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter details for student " + (i + 1));
                System.out.print("Roll No: ");
                int roll = sc.nextInt();
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Marks: ");
                double marks = sc.nextDouble();

                Student s = new Student(roll, name, marks);
                oos.writeObject(s);
            }

            oos.close();
            fos.close();
            System.out.println("\nStudent data written successfully to students.txt!");
            FileInputStream fis = new FileInputStream("students.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            System.out.println("\nReading student data from file:");
            try {
                while (true) {
                    Student s = (Student) ois.readObject();
                    System.out.println(s);
                }
            } catch (EOFException e) {}

            ois.close();
            fis.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found error: " + e.getMessage());
        }

        sc.close();
    }
}
