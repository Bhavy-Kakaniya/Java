class A {
    int a = 1;
    public int b = 2;
    private int c = 3;
    protected int d = 4;

    void display() {
        System.out.println("default" + a);
        System.out.println("public" + b);
        System.out.println("private" + c);
        System.out.println("protected" + d);
    }
}
class B extends A {
    void display(){
        System.out.println(a);
        System.out.println(b);
        // System.out.println(c); 
        System.out.println(d);
    }
}

public class p1 {
    public static void main(String[] args) {
        A a = new A();
        a.display();
        System.out.println(a.a);
        System.out.println(a.b);
        // System.out.println(a.c);
        System.out.println(a.d);
    }
}
// private variable cannot be used in same package in other class
