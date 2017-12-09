package Inline;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * https://www.jetbrains.com/help/idea/generify-refactoring.html
 */
public class Test {
    public void method() {
        AtomicLong anotherClass = null;
        int number = anotherClass.intValue();
        int a = 0;
        int b = a + number;
    }
}
