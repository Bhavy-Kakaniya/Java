package LAB.lab8;

interface a {
    int a = 1;

    void a();
}

interface a1 extends a {
    int a1 = 2;

    void a1();
}

interface a2 extends a {
    int a2 = 3;

    void a2();
}

interface a12 extends a1, a2 {
    int a12 = 4;

    void a12();
}

class b implements a12 {
    @Override
    public void a() {
        System.out.println("Number a is " + a);
    }

    @Override
    public void a1() {
        System.out.println("Number a1 is " + a1);
    }

    @Override
    public void a2() {
        System.out.println("Number a2 is " + a2);
    }

    @Override
    public void a12() {
        System.out.println("Number a12 is " + a12);
    }
}

public class _02Interface {
    public static void main(String[] args) {
        b obj = new b();
        obj.a();
        obj.a1();
        obj.a2();
        obj.a12();
    }
}
