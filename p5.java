package Day2;

import java.util.Scanner;

public class p5 {
    static int start(int n){
        while(n>10){
            n = n/10;
        }
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
