package WrapReturnValue;

/**
 * The Wrap Return Value refactoring allows you to select a method, and either create a wrapper class for its return values, or use an existing, compatible wrapper class. All returns from the method selected will be appropriately wrapped, and all calls to the method will have their returns unwrapped.
 * Choose Refactor | Wrap Return Value on the main menu, or on the context menu of the selection. Alternatively, select the desired method in the Structure views, and trigger refactoring from there.

 */
class Order {
    String customer;

    String getCustomer() {
        return customer;
    }
}