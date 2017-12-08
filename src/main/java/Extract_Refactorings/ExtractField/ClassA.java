package Extract_Refactorings.ExtractField;

/**
 * https://www.jetbrains.com/help/idea/extract-field.html
 */
public class ClassA {
    AnotherClass anotherClass;
    public void method() {
        int a = 1;
        int b = a + anotherClass.intValue();
        int c = b + anotherClass.intValue();
    }


    public void method2() {
        int a = anotherClass.innerClass.i;
        int b = anotherClass.innerClass.j;
    }
}