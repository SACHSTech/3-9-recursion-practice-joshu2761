package recursion;
/*
 * 5. Check if a String is a Palindrome
Write a recursive function isPalindrome(String s) to check if a string is a palindrome.
 */
public class IsPalindrome {
    
    public static boolean isPalindrome(String s){
        
        if (s.isEmpty() || s.length() == 1) {
            return true;
        }

        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam")); // Output: true
        System.out.println(isPalindrome("hello")); // Output: false
    }
}
