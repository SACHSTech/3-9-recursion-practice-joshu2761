package recursion;

public class CountUpTimer {

    /**
     * Count up from 1 to n
     * @param n
     */
    public static void countUp(int n) {
        if (n == 0) {
            return;
        }
        countUp(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        countUp(5); // Output: 1 2 3 4 5
    }
}