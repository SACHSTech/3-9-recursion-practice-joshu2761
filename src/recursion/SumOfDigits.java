package recursion;

public class SumOfDigits {

    /**
     * Sum of digits of a number
     * @param n
     * @return sum of digits
     */
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(123)); // 6
        System.out.println(sumOfDigits(1234)); // 10
        System.out.println(sumOfDigits(12345)); // 15
    }
}
