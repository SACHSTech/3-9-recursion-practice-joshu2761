package recursion;

public class SumofNaturalNumbers {

    /**
     * Calculate the sum of all numbers from 1 to n
     * @param n
     * @return sum of all numbers from 1 to n
     */
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(5)); // Output: 15
    }
}
