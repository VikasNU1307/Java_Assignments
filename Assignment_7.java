// Superclass A
class A {
    // Instance variables specific to class A
    int a1;
    String a2;

    // Method specific to class A
    void methodA1() {
        System.out.println("Method A1 from class A");
    }

    // Override method in all classes A, B, and C
    void overriddenMethod() {
        System.out.println("Override method in class A");
    }
}

// Subclass B extends A
class B extends A {
    // Instance variables specific to class B
    double b1;

    // Method specific to class B
    void methodB1() {
        System.out.println("Method B1 from class B");
    }

    // Override method in all classes A, B, and C
    @Override
    void overriddenMethod() {
        System.out.println("Override method in class B");
    }
}

// Subclass C extends B
class C extends B {
    // Instance variables specific to class C
    char c1;

    // Method specific to class C
    void methodC1() {
        System.out.println("Method C1 from class C");
    }

    // Override method in all classes A, B, and C
    @Override
    void overriddenMethod() {
        System.out.println("Override method in class C");
    }
}

// Main class with main method
public class Assignment_7 {

    public static void main(String[] args) {
        // Creating objects for each class
        A objA = new A();
        B objB = new B();
        C objC = new C();

        // Calling methods specific to class A
        objA.methodA1();
        objA.overriddenMethod(); // Calls A's overridden method

        // Calling methods specific to class B
        objB.methodA1(); // Inherited from A
        objB.methodB1();
        objB.overriddenMethod(); // Calls B's overridden method

        // Calling methods specific to class C
        objC.methodA1(); // Inherited from A
        objC.methodB1(); // Inherited from B
        objC.methodC1();
        objC.overriddenMethod(); // Calls C's overridden method

        // Demonstrating runtime polymorphism with superclass reference
        A ref1 = new B();
        ref1.overriddenMethod(); // Calls B's overridden method

        A ref2 = new C();
        ref2.overriddenMethod(); // Calls C's overridden method
    }
}
