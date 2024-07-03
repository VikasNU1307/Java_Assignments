// Merged example demonstrating various scenarios with interfaces and abstract classes

// Question 1: Interface with one method, implemented in a class
interface OneMethodInterface {
    void method1();
}

// Class implementing OneMethodInterface
class MyClass1 implements OneMethodInterface {
    public void method1() {
        System.out.println("Method1 implementation in MyClass1");
    }
}

// Question 2: Interface with two methods, one implemented in a class
interface TwoMethodInterface {
    void method1();
    void method2();
}

// Class implementing both methods of TwoMethodInterface
class MyClass2 implements TwoMethodInterface {
    public void method1() {
        System.out.println("Method1 implementation in MyClass2");
    }

    public void method2() {
        System.out.println("Method2 implementation in MyClass2");
    }
}

// Question 3: Using interface instances to call implemented method
interface Interface3 {
    void method();
}

// Implementing Interface3
class InterfaceExample3 implements Interface3 {
    public void method() {
        System.out.println("Method implementation in InterfaceExample3");
    }
}


// Question 4: Implementing two interfaces in one class
interface InterfaceA {
    void methodA();
}

interface InterfaceB {
    void methodB();
}

class MyClass4 implements InterfaceA, InterfaceB {
    public void methodA() {
        System.out.println("MethodA implementation in MyClass4");
    }
    public void methodB() {
        System.out.println("MethodB implementation in MyClass4");
    }
}

// Question 5: Two interfaces with the same method, implemented in one class
interface InterfaceC {
    void commonMethod();
}

interface InterfaceD {
    void commonMethod();
}

class MyClass5 implements InterfaceC, InterfaceD {
    public void commonMethod() {
        System.out.println("Common method implementation in MyClass5");
    }
}

// Question 6: Interface with a default method
interface DefaultMethodInterface {
    void method1(); // Abstract method

    default void defaultMethod() {
        System.out.println("Default method implementation in interface");
    }
}

// Class implementing DefaultMethodInterface
class MyClass6 implements DefaultMethodInterface {
    public void method1() {
        System.out.println("Method1 implementation in MyClass6");
    }
}

// Question 7: Interface inheriting from another interface
interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}

// Class implementing ChildInterface
class ImplementingClass implements ChildInterface {
    public void parentMethod() {
        System.out.println("Parent method implementation");
    }

    public void childMethod() {
        System.out.println("Child method implementation");
    }
}

// Question 8: Public interface with fields and methods
interface PublicInterface {
    int VALUE = 10; // Field with value assigned

    void method(); // Abstract method

    default void defaultMethod() {
        System.out.println("Default method implementation");
    }
}

// Class implementing PublicInterface
class ImplementationClass implements PublicInterface {
    public void method() {
        System.out.println("Method implementation");
    }
}

// Question 11: Interface with static final variable
interface Constants {
    static final int MAX_VALUE = 100; // Static final variable

    void method(); // Abstract method
}

// Class implementing Constants interface
class ConstantImplementation implements Constants {
    public void method() {
        System.out.println("Method implementation");
    }
}

// Main class to demonstrate all scenarios
public class Assignment_10 {
    public static void main(String[] args) {
        // Question 1
        OneMethodInterface obj1 = new MyClass1();
        obj1.method1();

        // Question 2
        TwoMethodInterface obj2 = new MyClass2();
        obj2.method1();

        // Question 3
        Interface3 obj3 = new InterfaceExample3();
        obj3.method();

        // Question 4
        MyClass4 obj4 = new MyClass4();
        obj4.methodA();
        obj4.methodB();

        // Question 5
        InterfaceC obj5 = new MyClass5();
        obj5.commonMethod();

        // Question 6
        MyClass6 obj6 = new MyClass6();
        obj6.method1();
        obj6.defaultMethod();

        // Question 7
        ImplementingClass obj7 = new ImplementingClass();
        obj7.parentMethod();
        obj7.childMethod();

        // Question 8
        ImplementationClass obj8 = new ImplementationClass();
        System.out.println("Interface field VALUE: " + PublicInterface.VALUE);
        obj8.method();
        obj8.defaultMethod();

        // Question 11
        System.out.println("MAX_VALUE: " + Constants.MAX_VALUE);
        ConstantImplementation obj11 = new ConstantImplementation();
        obj11.method();
    }
}
