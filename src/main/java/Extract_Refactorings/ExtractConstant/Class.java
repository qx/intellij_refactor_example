package Extract_Refactorings.ExtractConstant;

import java.util.ArrayList;

/**
 * https://www.jetbrains.com/help/idea/extract-constant.html
 */
public class Class {
    public void method() {
        String string = "string";
        ArrayList list = new ArrayList();
        list.add(string);
        anotherMethod(string);
    }

    private void anotherMethod(String string) {

    }
}