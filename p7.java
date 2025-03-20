package Day2;

import java.util.Scanner;

public class p7 {
    static int start(int n, int m){
        int temp = m;
        int digits =0;
        int p=1;

        while(temp>0)
        {
            temp=temp/10;
            digits++;
        }
        for(int i=0;i<digits;i++){
           p=p*10;
        }
       return (p*n) + m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter n2: ");
        int n2 = sc.nextInt();
        int c = start(n1,n2);
        System.out.println(c);
        sc.close();
}
}
