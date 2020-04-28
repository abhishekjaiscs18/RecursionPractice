import java.util.Scanner;

public class FabonacciSeries {
    public static int fabonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        return fabonacci(n-1)+fabonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of fabonacci series : ");
        int n= scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fabonacci(i)+" ");
        }
    }
}
