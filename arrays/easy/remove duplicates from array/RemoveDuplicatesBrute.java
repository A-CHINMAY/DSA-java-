import java.util.*;

public class RemoveDuplicatesBrute {
    public static int removeDuplicates(int[] arr, int n) {
        Set<Integer> set = new TreeSet<>(); // TreeSet keeps sorted order
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        int index = 0;
        for (int val : set) {
            arr[index++] = val;
        }
        return index;
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
