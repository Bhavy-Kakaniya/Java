class SuperDemo {
    int a = 10;
    int b = 20;

    public SuperDemo(int a, int b) {
        int ans = this.a + this.b;
        System.out.println(ans);
    }

    void HW() {
        System.out.println("Hello world");
    }
}

class ChildClass extends SuperDemo {
    int a = 5;

    public ChildClass() {
        super(30, 40);
        System.out.println("Constructor of parent class is called");

    }

    void HW() {
        System.out.println("Method of parent class is overided");
        super.HW();
        System.out.println("Method from parent class is called");
    }
}

public class _03super {
    public static void main(String[] args) {
        ChildClass CC1 = new ChildClass();
        CC1.HW();
    }
}
