class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class demo1 {
    public static void main(String[] args) {
        Student s1 = new Student("Bhavy", 20);
        // Student s2 = new Student();

        s1.name = "Bhavy";
        s1.age = 20;
        // s2.name = "Neel";
        // s2.age = 19;

        Student s2 = new Student(s1);

        // s1.printInfo();
        s2.printInfo();
    }
}
