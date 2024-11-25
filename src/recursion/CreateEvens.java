package recursion;

public class CreateEvens {
    
    /**
     * Print all even numbers from start to end
     * @param start
     * @param end
     */
    public static void printEvens(int start, int end) {
        if (start > end) {
            return;
        }
        if (start % 2 == 0) {
            System.out.print(start + " ");
        }
        printEvens(start + 1, end);
    }

    public static void main(String[] args) {
        printEvens(1, 10); // Output: 2 4 6 8 10
    }
}
