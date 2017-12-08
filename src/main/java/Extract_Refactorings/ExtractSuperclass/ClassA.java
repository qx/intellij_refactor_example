package Extract_Refactorings.ExtractSuperclass;

/**
 * https://www.jetbrains.com/help/idea/extract-superclass.html
 */
// File ClassA.java
public class ClassA {
    public int varInt;
    private double varDouble;
    public static final int CONSTANT = 0;

    public void publicMethod() {
    }

    public void hiddenMethod() {
    }

    public void setVarDouble(double var) {
        this.varDouble = var;
    }

    public double getVarDouble() {
        return
                varDouble;
    }
}