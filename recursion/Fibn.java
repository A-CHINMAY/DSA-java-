package recursion;

public class Fibn {
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int a = fib(n-1) + fib(n-2);
        return a;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(fib(n));
    }
    
}
