import java.util.Scanner;

public class FactorialOfNumber {
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=scanner.nextInt();
        System.out.println(factorial(n));
    }
}
