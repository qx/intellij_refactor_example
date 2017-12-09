package Convert_Anonymous_to_Inner;


public class Class {
    public Interface method() {
        final int i = 0;
        return new Interface() {//curse to here
            public int publicMethod() {
            return i;}
        };
    }
}