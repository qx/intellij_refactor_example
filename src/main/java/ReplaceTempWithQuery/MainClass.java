package ReplaceTempWithQuery;

/**
 * The Find and Replace Code Duplicates action allows you to find code repetitions similar to the selected method or constant field, and replace them with calls to the original method or constant.
 *
 */
public class MainClass {

    public void method() {
        String str ="str";
        String aString = returnString().concat(str);//选中astring重构
        System.out.println(aString);
    }

    private String returnString() {
        return null;
    }

}
