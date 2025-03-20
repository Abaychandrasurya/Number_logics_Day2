package Day2;

import java.util.Scanner;

public class p2 {
    static int start(int n){
        n = n/100;
        n = (n*100)+77;
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1: ");
        int n1 = sc.nextInt();
        int c = start(n1);
        System.out.println(c);
        sc.close();
}
}
