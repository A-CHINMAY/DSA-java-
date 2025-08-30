package recursion;

public class SumOfNum {
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        int a = n + sum(n-1);
        return a;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }
}
