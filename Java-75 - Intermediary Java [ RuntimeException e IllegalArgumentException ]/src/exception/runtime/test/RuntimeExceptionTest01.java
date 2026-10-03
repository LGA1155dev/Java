package exception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // Checked and Unchecked
        Object object = null;

        if (object != null) {
            System.out.println(object.toString());
        }throw  new IllegalArgumentException("Objeto é nulo");
    }
}
