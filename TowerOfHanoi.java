import java.util.Scanner;

public class TowerOfHanoi {
    public static void towerofhanoi(int n,char from,char to,char aux){
        if(n==1){
            System.out.println("Move Disk 1 from rod "+from+" to rod "+to);
            return;
        }
        towerofhanoi(n-1,from,aux,to);
        System.out.println("Move Disk "+n+" from rod "+from+" to rod "+to);
        towerofhanoi(n-1,aux,to,from);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=scanner.nextInt();
        towerofhanoi(n,'A','C','B');
    }
}
