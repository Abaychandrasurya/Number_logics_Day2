package Day2;

import java.util.Scanner;

public class p4 {
    static int end(int n){
            int x = n/10;
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1: ");
        int n1 = sc.nextInt();
        int c = end(n1);
        System.out.println(c);
        sc.close();
}
}
