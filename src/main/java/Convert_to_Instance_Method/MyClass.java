package Convert_to_Instance_Method;

public class MyClass {
    ClassA classA = new ClassA();
    ClassB classB = new ClassB();

    static public void greatMethod(ClassA classA, ClassB classB) {
        System.out.println("ClassA=" + classA);
        System.out.println("ClassB=" + classB);
    }

    public void myMethod() {
        MyClass.greatMethod(classA, classB);
    }
}
