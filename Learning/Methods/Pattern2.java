import java.util.Scanner;
public class pattern {
    static void pattern(int n){
        for(int i=0; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print pattern: ");
        int n = sc.nextInt();
        pattern(n);
    }
}

// *
// * *
// * * *
// * * * *
// * * * * *
