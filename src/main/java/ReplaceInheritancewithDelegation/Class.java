package ReplaceInheritancewithDelegation;

/**
 * The Replace Inheritance With Delegation refactoring allows removing a class from inheritance hierarchy, while preserving the functionality of the parent. IntelliJ IDEA creates a private inner class, that inherits the former superclass or interface. Selected methods of the parent are invoked via the new inner class.
 */
public class Class extends SuperClass {
    public int varInt;
    public void openMethod() {
    }
}