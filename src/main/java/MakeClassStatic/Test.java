package MakeClassStatic;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 https://www.jetbrains.com/help/idea/make-class-static.html
 */
public class Test {
    private double a;
    public boolean method() {
        if (a > 15 && a < 100) {
            a = 5;
            return true;
        }
        return false;
    }

    private class Test2 {

    }
}
