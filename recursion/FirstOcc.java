package recursion;

public class FirstOcc {
    public static int firstcheck(int arr[],int key,int idx){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == key){
            return idx;
        }
        return firstcheck(arr, key, idx+1);
    }

    public static int lastcheck(int arr[], int key, int idx) {
        if (idx == arr.length) {
            return -1;
        }
        int isFound = lastcheck(arr, key, idx + 1);
        if (arr[idx] == key && isFound == -1) {
            return idx;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,3,5,2,3,2,4,5,4,5,4,4,2,2,3,2};
        System.out.println(firstcheck(arr, 5, 0));
        System.out.println(lastcheck(arr, 2, 0));
    }
    
}
