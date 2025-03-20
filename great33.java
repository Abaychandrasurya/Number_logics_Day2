package Day2;
import java.util.Scanner;

public class great33 {
    static int max(int x, int y){
        if(x>y){
            return x;
        }
        else {
            return y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter n2: ");
        int n2 = sc.nextInt();
        int c = max(n1, n2);
        System.out.println("Greater = " + c);
        sc.close();
}
}
