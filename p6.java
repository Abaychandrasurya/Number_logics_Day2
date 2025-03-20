package Day2;

import java.util.Scanner;

public class p6 {
    static int start(int n){
        int temp = n;
        int digits =0;
        int p=1;

        while(temp>0)
        {
            temp=temp/10;
            digits++;
        }
        for(int i=0;i<digits-1;i++){
           p=p*10;
        }
        n = n % p;
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
