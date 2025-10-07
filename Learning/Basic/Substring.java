import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s1 = sc.nextLine();
        System.out.println(s1.substring(1,3));
        System.out.println(s1.replace('a', 'b'));
        System.out.println(s1.replace("av", "bhavy"));
    }
}
