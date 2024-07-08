// Assignment_12.java (Main class to demonstrate constructor scenarios)
public class Assignment_12 {

    public static void main(String[] args) {
        // Question 1: Calling constructors of ConstructorsClass
        ConstructorsClass obj1 = new ConstructorsClass(); // Default constructor
        ConstructorsClass obj2 = new ConstructorsClass(10); // One argument constructor
        ConstructorsClass obj3 = new ConstructorsClass(20, "Hello"); // Two argument constructor

        // Question 2: Calling constructors of super class from ChildClass
        ChildClass childObj = new ChildClass();

        // Question 3: Applying access modifiers to constructors
        // PrivateConstructorClass privateObj = new PrivateConstructorClass(); // Private constructor - Error: not accessible
        PublicConstructorClass publicObj = new PublicConstructorClass();
        ProtectedConstructorClass protectedObj = new ProtectedConstructorClass();
        DefaultConstructorClass defaultObj = new DefaultConstructorClass();

        // Question 4: Constructors with return type
        ConstructorWithReturnType intConstructor = new ConstructorWithReturnType(5);
        ConstructorWithReturnTypeString stringConstructor = new ConstructorWithReturnTypeString("Return");

        // Question 5: Calling constructor multiple times with the same object
        MultipleConstructorCalls obj = new MultipleConstructorCalls();
        obj.printValues(); // Print values after multiple constructor calls
    }

    // Class with default, one argument, and two argument constructors
    static class ConstructorsClass {
        // Default constructor
        public ConstructorsClass() {
            System.out.println("Default constructor called");
        }

        // One argument constructor
        public ConstructorsClass(int arg1) {
            System.out.println("One argument constructor called with arg1 = " + arg1);
        }

        // Two argument constructor
        public ConstructorsClass(int arg1, String arg2) {
            System.out.println("Two argument constructor called with arg1 = " + arg1 + " and arg2 = " + arg2);
        }
    }

    // Child class calling super class constructors
    static class ParentClass {
        public ParentClass() {
            System.out.println("ParentClass: Default constructor called");
        }

        public ParentClass(int arg) {
            this(); // Calling default constructor of ParentClass
            System.out.println("ParentClass: One argument constructor called with arg = " + arg);
        }
    }

    static class ChildClass extends ParentClass {
        public ChildClass() {
            super(); // Calling default constructor of ParentClass
        }

        public ChildClass(int arg) {
            super(arg); // Calling one argument constructor of ParentClass
        }
    }

    // Class with private constructor
    static class PrivateConstructorClass {
        private PrivateConstructorClass() {
            System.out.println("PrivateConstructorClass: Private constructor called");
        }
    }

    // Class with public constructor
    static class PublicConstructorClass {
        public PublicConstructorClass() {
            System.out.println("PublicConstructorClass: Public constructor called");
        }
    }

    // Class with protected constructor
    static class ProtectedConstructorClass {
        protected ProtectedConstructorClass() {
            System.out.println("ProtectedConstructorClass: Protected constructor called");
        }
    }

    // Class with default (package-private) constructor
    static class DefaultConstructorClass {
        DefaultConstructorClass() {
            System.out.println("DefaultConstructorClass: Default constructor called");
        }
    }

    // Class with constructors having return type
    static class ConstructorWithReturnType {
        // Constructor with int return type
        ConstructorWithReturnType(int value) {
            System.out.println("ConstructorWithReturnType: Constructor with int return type called with value = " + value);
        }
    }

    // Class with constructor having return type String
    static class ConstructorWithReturnTypeString {
        // Constructor with String return type
        ConstructorWithReturnTypeString(String value) {
            System.out.println("ConstructorWithReturnTypeString: Constructor with String return type called with value = " + value);
        }
    }

    // Class demonstrating calling constructor multiple times with the same object
    static class MultipleConstructorCalls {
        int value;

        MultipleConstructorCalls() {
            this(0); // Call one argument constructor with default value
            System.out.println("MultipleConstructorCalls: Default constructor called");
        }

        MultipleConstructorCalls(int value) {
            this.value = value;
            System.out.println("MultipleConstructorCalls: One argument constructor called with value = " + value);
        }

        void printValues() {
            System.out.println("Value = " + value);
        }
    }
}
