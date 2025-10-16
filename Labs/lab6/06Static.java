class Static_demo {
    static int count = 0;

    public Static_demo() {
        count++;
    }

    public static void displayCount() {
        System.out.println("Total objects created " + count);
    }
}

public class _06static {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Static_demo c1 = new Static_demo();
        Static_demo c2 = new Static_demo();
        Static_demo c3 = new Static_demo();
        Static_demo c4 = new Static_demo();
        Static_demo.displayCount();
    }
}
