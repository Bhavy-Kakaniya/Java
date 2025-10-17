import java.util.Scanner;

class Member {
    String name;
    int age;
    String number;
    String address;
    int salary;

    public Member(String name, int age, String number, String address, int salary) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Number: " + number);
        System.out.println("Address: " + address);
        printSalary();
    }
}

class Employee extends Member {
    String specialization;

    public Employee(String name, int age, String number, String address, int salary, String specialization) {
        super(name, age, number, address, salary);
        this.specialization = specialization;
    }

    public void displayEmployeeDetails() {
        displayDetails();
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Member {
    String department;

    public Manager(String name, int age, String number, String address, int salary, String department) {
        super(name, age, number, address, salary);
        this.department = department;
    }

    public void displayManagerDetails() {
        displayDetails();
        System.out.println("Department: " + department);
    }
}

public class _05Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 for Employee and 2 for Manager: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String number = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Salary: ");
        int salary = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            System.out.print("Enter Specialization: ");
            String specialization = sc.nextLine();

            Employee emp = new Employee(name, age, number, address, salary, specialization);
            System.out.println("\nEmployee Details:");
            emp.displayEmployeeDetails();
        } else if (choice == 2) {
            System.out.print("Enter Department: ");
            String department = sc.nextLine();

            Manager mgr = new Manager(name, age, number, address, salary, department);
            System.out.println("\nManager Details:");

            mgr.displayManagerDetails();
        } else {
            System.out.println("Invalid choice! Please enter 1 or 2.");
        }
    }
}
