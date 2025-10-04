public class overloadin {
    static void change(int[] marks) {
        marks[0] = 100;
    }

    static void change1(int x) {
        x = 10;
    }

    static void overloading() {
        System.out.println("Hello world 1");
    }

    static void overloading(int a) {
        System.out.println("hello world 2" + a);
    }

    static void overloading(int a, int b) {
        System.out.println("hello world 3" + a);
        System.out.println("hello world 4" + b);
    }

    static int sum(int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        int marks[] = { 0, 1, 3, 4, 5, };
        change(marks);
        System.out.println("after changing: " + marks[0]);
        int x = 5;
        change1(x);
        System.out.println("after changing: " + x);

        // overloading
        overloading();
        overloading(2);
        overloading(3, 4);
        System.out.println("the sum using varargs is : " + sum(10, 5));
    }
}
