package Convert_Anonymous_to_Inner;

public class ClassA {
    public Interface method() {
        final int i = 0;
        return new Interface() {
            public int publicMethod() {
            return i;}
        };
    }
}