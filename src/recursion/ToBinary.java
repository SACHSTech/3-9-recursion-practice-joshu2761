package recursion;

public class ToBinary {
    
    /**
     * Convert a decimal number to binary
     * @param n
     * @return binary number
     */
    public static int toBinary(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 2 + 10 * toBinary(n / 2);
    }

    public static void main(String[] args) {
        System.out.println(toBinary(10)); // 1010
        System.out.println(toBinary(15)); // 1111
        System.out.println(toBinary(16)); // 10000
    }
}
