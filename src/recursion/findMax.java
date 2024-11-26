package recursion;

public class FindMax {
    
    /**
     * Find the maximum element in an array
     * @param arr
     * @param n
     * @return maximum element
     */
    public static int findMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.max(arr[n - 1], findMax(arr, n - 1));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(findMax(arr, arr.length)); // 5
    }
}
