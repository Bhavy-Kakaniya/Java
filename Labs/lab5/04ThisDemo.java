class demo {
    static int a = 20;
    public  demo() {
        this.a++;
    }

    void display() {
    System.out.println(this.a);
    }
}

public class _04this1 {
    public static void main(String[] args) {
        demo a1 = new demo();
        a1.display();
    }
}
