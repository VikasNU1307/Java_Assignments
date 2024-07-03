
// 1. Create an abstract class with abstract and non-abstract methods
abstract class AbstractClass {
    // Abstract method (must be implemented by subclasses)
    abstract void abstractMethod();

    // Non-abstract method
    void nonAbstractMethod() {
        System.out.println("This is a non-abstract method in the AbstractClass");
    }
}

// 2. Create a subclass for the abstract class
class SubClass extends AbstractClass {
    // Implementing the abstract method from the abstract class
    void abstractMethod() {
        System.out.println("Implementation of abstractMethod in SubClass");
    }

    // Additional method specific to SubClass
    void subClassMethod() {
        System.out.println("Method specific to SubClass");
    }

    // 3. Create an instance for the child class in the child class and call abstract methods
    void callAbstractMethod() {
        abstractMethod(); // Calling abstract method
    }

    // 4. Create an instance for the child class in the child class and call non-abstract methods
    void callNonAbstractMethod() {
        nonAbstractMethod(); // Calling non-abstract method from the abstract class
    }
}

// Main class to demonstrate usage
public class Assignment_9 {
    public static void main(String[] args) {
        // Creating an object of SubClass
        SubClass obj = new SubClass();

        // Accessing non-abstract method from AbstractClass through SubClass object
        obj.nonAbstractMethod();

        // Calling abstract method through SubClass object
        obj.callAbstractMethod();

        // Calling method specific to SubClass
        obj.subClassMethod();

        // Calling non-abstract method from AbstractClass through SubClass object again
        obj.callNonAbstractMethod();
    }
}
