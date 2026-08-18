package now.exception.understand.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
            division(1, 0);
            System.out.println("Code completed");
    }

    /**
     *
     * @param a
     * @param b
     * @return a / b
     * @throws IllegalArgumentException case b be 0
     */

    private static int division(int a, int b) {
        if (b == 0)
            throw new IllegalArgumentException("illegal argument, b can't be 0");
        return a / b;
    }
}
