class Employee {
    int id;
    String name;

    public void details() {
        System.out.println("My name is " + name);
        System.out.println("My id is " + id);
    }
}

public class class1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.name = "bhavy";
        emp1.id = 10;
        emp2.name = "neel";
        emp2.id = 11;
        // System.out.println(emp1.id);
        // System.out.println(emp1.name);
        emp1.details();
        emp2.details();
    }
}
