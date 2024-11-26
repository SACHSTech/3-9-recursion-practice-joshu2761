package recursion;

public class CountChar {
    
    /**
     * Count the number of occurrences of a character in a string
     * @param s
     * @param c
     * @return number of occurrences
     */
    public static int countChar(String s, char c) {
        if (s.isEmpty()) {
            return 0;
        }
        if (s.charAt(0) == c) {
            return 1 + countChar(s.substring(1), c);
        }
        return countChar(s.substring(1), c);
    }

    public static void main(String[] args) {
        System.out.println(countChar("hello", 'l')); // Output: 2
    }
}
