package recursion;

public class Power {
    
    /**
     * Calculate the power of a number
     * @param base
     * @param exponent
     * @return base raised to the power of exponent
     */
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 5)); // Output: 32
    }
}
