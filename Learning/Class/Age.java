class Person {
    int age;
    static String name;

    public void displayAge() {
        System.out.println("Age " + age);
    }

    public static void displayName() {
        System.out.println("Name " + name);
    }
}

public class p1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Bhavy";
        p1.age = 19;
        p1.displayAge();
        p1.displayName();
    }
}
