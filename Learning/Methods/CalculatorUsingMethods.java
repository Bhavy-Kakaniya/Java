import java.util.Scanner;
public class calculator{
    static void add(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
    static void sub(int a, int b){
        int diff = a-b;
        System.out.println(diff);
    }
    static void mul(int a, int b){
        int pro = a*b;
        System.out.println(pro);
    }
    static void div(int a, int b){
        int div = a/b;
        System.out.println(div);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1 = add, 2 = sub, 3 = mul, 4 = div");
        System.out.println("enter number1 : ");
        int a = sc.nextInt();
        System.out.println("enter operation : ");
        int operation = sc.nextInt();
        System.out.println("enter number2 : ");
        int b = sc.nextInt();
        if (operation==1) {
            add(a,b);
        }
        if (operation==2) {
            sub(a,b);
        }
        if (operation==3) {
            mul(a,b);
        }
        if (operation==4) { 
            div(a,b);
        }
    }
}
