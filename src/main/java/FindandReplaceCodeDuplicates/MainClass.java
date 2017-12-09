package FindandReplaceCodeDuplicates;

/**
 * The Find and Replace Code Duplicates action allows you to find code repetitions similar to the selected method or constant field, and replace them with calls to the original method or constant.
 */
public class MainClass {

    public void method() {
        int a = 1;
        int b = 2;
        int c = a + b;
        int d = b + c;
    }
    public void method_b() {
        int a = 1;
        int b = 2;
        int c = a + b;
        int d = b + c;
    }
    private int add(int a, int b) {
        return a + b;
    }
}
