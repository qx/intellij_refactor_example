package Extract_Refactorings.ExtractParameter;

/**
 * https://www.jetbrains.com/help/idea/extract-parameter-in-java.html
 */
public class HelloWorldPrinter {
    public static void print() {
        System.out.println(generateText());
    }

    private static String generateText() {
        return "Hello, World!".toUpperCase();
    }
}