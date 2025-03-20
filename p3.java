package Day2;

import java.util.*;

public class p3 {
    static int start(int m, int n){
        int temp = n;
        int digits =0;
        int p=0;

        while(n>0)
        {
            temp/=10;
            digits++;
        }
        for(int i=0;i<digits;i++){
            p*=10;
        }
        int r = p+m;
        return r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter n1: ");
        int n2 = sc.nextInt();
        int c = start(n1,n2);
        System.out.println(c);
        sc.close();
}
}
