package recursion;
/*
 * 4. Reverse a String
Write a recursive function reverse(String s) that takes a string s and returns it reversed.
 */
public class Reverse {
    
    /**
     * Reverse a string
     * @param s
     * @return reversed string
     */
    public static String reverse(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello world")); // Output: dlrow olleh
    }
}
