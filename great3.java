package Day2;

public class great3 {
    static int max(int x, int y){
        if(x>y){
            return x;
        }
        else {
            return y;
        }
    }
    public static void main(String[] args) {
        int a = 12, b = 20, c;
         c = max(a, b);
        System.out.println(c);
}
}