package Extract_Refactorings.ExtractVariable;

import Extract_Refactorings.ExtractField.AnotherClass;

public class Test {
    private AnotherClass anotherClass;

    public void method() {
        int a = 1;
        int b = a + anotherClass.intValue();
        int c = b + anotherClass.intValue();
    }
}
