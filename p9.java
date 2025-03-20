package Day2;

import java.util.Scanner;

public class p9 {
    static int start(int m, int n){
        int temp1 = m;
        int temp2 =m;
        int digits1 =0;

        while(temp1>0)
        {
            temp1=temp1/10;
            digits1++;
        }

        int temp = n;
        int digits2 =0;
        int q=1;
        int p=1;
        int r=0;

        while(temp>0)
        {
            temp=temp/10;
            digits2++;
        }
        for(int i=0;i<digits1-digits2;i++){
           q=q*10;                                                                                                                                     
        }
        for(int i=0;i<digits1;i++){
           p=p*10;                                                                                                                                     
         }

       m = m%q;
       r = temp2/q;
       n = (r*p)+(n*q) + m; 
       return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter n2: ");
        int n2 = sc.nextInt();
        int c = start(n1, n2);
        System.out.println(c);
        sc.close();
    }
}
