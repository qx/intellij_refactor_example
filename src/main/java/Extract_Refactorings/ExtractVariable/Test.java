package Extract_Refactorings.ExtractVariable;

import Extract_Refactorings.ExtractField.AnotherClass;

/**
 * The Extract Variable refactoring puts the result of the selected expression into a variable. It declares a new variable and uses the expression as an initializer. The original expression is replaced with the new variable (see the examples below).
 public void method() {
 int a = 1;
 int number = anotherClass.intValue();
 int b = a + number;
 int c = b + number;
 }
 */
public class Test {
    private AnotherClass anotherClass;

    public void method() {
        int a = 1;
        int b = a + anotherClass.intValue();//anotherClass.intValue() refactor this
        int c = b + anotherClass.intValue();
    }
}
