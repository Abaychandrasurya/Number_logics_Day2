package Day2;
import java.util.Scanner;

public class p10 {
    static int start(int m, int n){
        int temp1 = m;
        int a =m;
        int temp = n;
        int digits1 =0;
        int digits2 =0;
        int q=1;
        int p=1;
        int r=0;
        int s=0;
        int t=0;

        while(temp1>0)
        {
            temp1=temp1/10;
            digits1++;
        }
        s = digits1/2;

        while(temp>0)
        {
            temp=temp/10;
            digits2++;
        }
        t = digits2/2;

        for(int i=0;i<s+t;i++){
           q=q*10;                                                                                                                                     
        }

        for(int i=0;i<digits2+s;i++){
           p=p*10;                                                                                                                                     
        }

        for(int i=0;i<s;i++){
            q=q*10;                                                                                                                                     
         }

        m = m/q;
        r=a/q;
        n = (r*p)+(n*q)+ m; 

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
