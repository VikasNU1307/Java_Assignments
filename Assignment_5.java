// 1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance methods and a main method.
class ExampleClass {
    // Static variables (Question 1)
    static int staticVar1;
    static String staticVar2;

    // Instance variables (Question 1)
    int instanceVar1;
    String instanceVar2;

    // Constructor (not explicitly required in the questions, assumed for instance variable initialization)
    ExampleClass(int instanceVar1, String instanceVar2) {
        this.instanceVar1 = instanceVar1;
        this.instanceVar2 = instanceVar2;
    }

    // Static method 1 (Question 1)
    static void staticMethod1() {
        System.out.println("Inside staticMethod1:");
        System.out.println("Static variable 1: " + staticVar1);
        System.out.println("Static variable 2: " + staticVar2);
    }

    // Static method 2 (Question 1)
    static void staticMethod2() {
        System.out.println("Inside staticMethod2:");
        System.out.println("Static variable 1: " + staticVar1);
        System.out.println("Static variable 2: " + staticVar2);
    }

    // Instance method 1 (Question 1)
    void instanceMethod1() {
        System.out.println("Inside instanceMethod1:");
        System.out.println("Instance variable 1: " + instanceVar1);
        System.out.println("Instance variable 2: " + instanceVar2);
        
        // Calling static methods in instance method (Question 5)
        ExampleClass.staticMethod1();
        ExampleClass.staticMethod2();
    }

    // Instance method 2 (Question 1)
    void instanceMethod2() {
        System.out.println("Inside instanceMethod2:");
        System.out.println("Instance variable 1: " + instanceVar1);
        System.out.println("Instance variable 2: " + instanceVar2);
        
        // Calling static methods in instance method (Question 5)
        ExampleClass.staticMethod1();
        ExampleClass.staticMethod2();
    }

    // Main method (Question 7)
    public static void main(String[] args) {
        // 6. Print all the static, instance variables in main method
        System.out.println("Static variable 1: " + staticVar1);
        System.out.println("Static variable 2: " + staticVar2);

        ExampleClass obj = new ExampleClass(10, "Hello");
        
        // 7. Call static methods and instance methods in main method
        staticMethod1();         
        staticMethod2();         
        obj.instanceMethod1();   
        obj.instanceMethod2();   
    }
}
