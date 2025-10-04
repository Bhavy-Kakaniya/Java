import java.util.Scanner;
class overloading {
    static void overloading(int n1) {
        System.out.println(n1);
    }

    static void overloading(int n1, int n2) {
        System.out.println(n1+n2);
    }
    static void overloading(int ...array){
        int ans=0;
        for(int i : array){
            ans = i + ans;
        }
        System.out.println(ans);
    }
}

public class overload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to add: ");
        int n1 = sc.nextInt();
        System.out.println("Enter number to add: ");
        int n2 = sc.nextInt();
        overloading sum1 = new overloading();
        sum1.overloading(n1);
        sum1.overloading(n1, n2);
        sum1.overloading(1,2,3,6);
    }
}
