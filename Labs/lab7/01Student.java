import java.util.Scanner;

class Student {
    String id_no;
    int no_of_subjects_registered;
    String[] subject_code;
    int[] subject_credits;
    String[] grade_obtained;
    double spi;

    public Student(String id_no, int no_of_subjects_registered, String[] subject_code, int[] subject_credits,
            String[] grade_obtained) {
        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        this.subject_code = subject_code;
        this.subject_credits = subject_credits;
        this.grade_obtained = grade_obtained;
        this.spi = calculateSPI();
    }

    private double calculateSPI() {
        int totalCredits = 0;
        double sum = 0.0;
        for (int i = 0; i < no_of_subjects_registered; i++) {
            int marks = getMarks(grade_obtained[i]);
            sum += marks * subject_credits[i];
            totalCredits += subject_credits[i];
        }
        return (totalCredits > 0) ? (sum / totalCredits) : 0.0;
    }

    private int getMarks(String grade) {
        switch (grade) {
            case "A":
                return 10;
            case "B":
                return 8;
            case "C":
                return 6;
            case "D":
                return 4;
            case "E":
                return 2;
            case "F":
                return 0;
            default:
                return 0;
        }
    }

    public void display() {
        System.out.println("\nStudent ID: " + id_no);
        System.out.println("Subjects Registered: " + no_of_subjects_registered);
        for (int i = 0; i < no_of_subjects_registered; i++) {
            System.out.println("Subject Code: " + subject_code[i] + ", Credits: " + subject_credits[i] +
                    ", Grade: " + grade_obtained[i]);
        }
        System.out.printf("SPI: %.2f\n", spi);
    }
}

public class _01Student {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ": ");
            System.out.print("Enter Student ID: ");
            String id_no = sc.next();
            System.out.print("Enter number of subjects registered: ");
            int no_of_subjects = sc.nextInt();

            String[] subject_code = new String[no_of_subjects];
            int[] subject_credits = new int[no_of_subjects];
            String[] grade_obtained = new String[no_of_subjects];

            for (int j = 0; j < no_of_subjects; j++) {
                System.out.print("Enter Subject" + (i + 1) + " Code : ");
                subject_code[j] = sc.next();
                System.out.print("Enter Subject" + (i + 1) + " Credits: ");
                subject_credits[j] = sc.nextInt();
                System.out.print("Enter Grade (A/B/C/D/E/F): ");
                grade_obtained[j] = sc.next();
            }
            students[i] = new Student(id_no, no_of_subjects, subject_code, subject_credits, grade_obtained);
        }
        System.out.println("\n----- Student Details -----");
        for (int i = 0; i < n; i++) {
            students[i].display();
        }
    }
}
