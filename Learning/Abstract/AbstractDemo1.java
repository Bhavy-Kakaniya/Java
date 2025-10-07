abstract class parent {
    void HW() {
        System.out.println("hello world");
    }

    // abstract void GM(); // abstract methods cannot have a body

    parent() {
        System.out.println("this is constructor of parent class");
    }

    abstract void print(); // this method must be implemented in every child class
}

class child1 extends parent {
    child1() {
        System.out.println("hello");
    }

    void print() {
        System.out.println("this is abstract method implemented in child class");
    }
}

public class a1 {
    public static void main(String[] args) {
        child1 obj = new child1(); // creating object of child class
        obj.HW();                  // calling non-abstract method
        obj.print();               // calling abstract method (implemented)
    }
}
