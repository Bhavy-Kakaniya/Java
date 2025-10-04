import java.util.Scanner;
public class fibonaci {
    static int fib(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find term: ");
        int n = sc.nextInt();
        System.out.println("the term is : "+fib(n));
    }
}
