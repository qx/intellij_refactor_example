package Extract_Refactorings.Extract_Method_Object;

/**
 * The Extract Method Object refactoring moves method into a new class, converting all the local variables to its fields, allowing you to decompose the method into other methods on the same object. It is an alternative to the Extract Method, and can be used when you have multiple return values in an extracted method.
 */
class Account {
    int gamma(int val1, int c, int a) {
        //some computations
        return c - 2 * a;
    }
}