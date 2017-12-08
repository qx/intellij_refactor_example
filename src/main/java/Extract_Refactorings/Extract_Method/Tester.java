package Extract_Refactorings.Extract_Method;

import java.util.ArrayList;

public class Tester {
    public void method() {
        int a = 1;
        int b = 2;
        int c = a + b;
        int d = a + c;
    }

    public ArrayList method2() {
        String[] strings = {"a", "b", "c"};
        ArrayList list = new ArrayList();
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i]);
        }
        return list;
    }
}
