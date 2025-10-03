import java.util.Scanner;
public class sum2 {
    static void sumOfNumber(int a, int b ){
        int sum = a + b;
        System.out.println(sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a : ");
        int a = sc.nextInt();
        System.out.println("enter b : ");
        int b = sc.nextInt();
        sumOfNumber(a,b);
        //using object
        //sum2 obj = new sum2();
        //ans = obj.sumOfNumber(a,b);
    }
}
