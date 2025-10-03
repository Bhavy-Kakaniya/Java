import java.util.Scanner;
public class pattern2 {
    static void pattern(int n){
        for(int i=0; i<n; i++){
            for(int j=n; j>i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print pattern : ");
        int n = sc.nextInt();
        pattern(n);
    }
}

// * * * * * 
// * * * * 
// * * * 
// * * 
// *
