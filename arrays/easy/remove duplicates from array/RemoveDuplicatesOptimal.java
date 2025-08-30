import java.util.Scanner;

public class RemoveDuplicatesOptimal {
    public static int removeDuplicates(int[] arr, int n) {
        if (n == 0 || n == 1)
            return n;

        int j = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[j]) {
                arr[++j] = arr[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int newLength = removeDuplicates(arr, n);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
