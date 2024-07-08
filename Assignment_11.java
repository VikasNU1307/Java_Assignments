// Parent class
class ParentClass {
    int parentField;

    // Parent constructor
    ParentClass(int parentField) {
        this.parentField = parentField;
    }

    void parentMethod() {
        System.out.println("Parent method");
    }
}

// Child class inheriting from ParentClass
class ChildClass extends ParentClass {
    int childField;

    // Child constructors
    ChildClass() {
        // Calling parent constructor using super()
        super(10);
        this.childField = 20;
    }

    ChildClass(int parentField, int childField) {
        // Calling parent constructor and initializing child fields
        super(parentField);
        this.childField = childField;
    }

    void printCurrentFields() {
        System.out.println("Current class fields using 'this':");
        System.out.println("childField = " + this.childField);
        System.out.println("parentField (inherited) = " + this.parentField);
    }

    void printParentFields() {
        System.out.println("Parent class fields using 'super':");
        System.out.println("parentField = " + super.parentField);
    }

    void callCurrentClassConstructorUsingThis() {
        // Error: Constructor call must be the first statement
        // this(); 

        // Correct way: Use this() in another method
        System.out.println("Calling default constructor of current class using this()");
        new ChildClass();
    }

    void callArgumentConstructorUsingThis(int parentField, int childField) {
        // Error: Constructor call must be the first statement
        // this(parentField, childField); 

        // Correct way: Use this() in another method
        System.out.println("Calling argument constructor of current class using this()");
        new ChildClass(parentField, childField);
    }

    void callParentClassConstructorUsingSuper() {
        // Error: Constructor call must be the first statement
        // super(30); 

        // Correct way: Use super() in the constructor
        System.out.println("Calling constructor of parent class using super()");
        super.parentMethod(); // This calls the parent method, not constructor
    }

    void methodUsingThisAndSuper() {
        System.out.println("Method using this and super:");
        this.printCurrentFields(); // Using this to call method in the current class
        super.parentMethod(); // Using super to call method in the parent class
    }
}

// Main class to demonstrate functionality
public class Assignment_11 {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();

        // Question 1: Print current class fields using 'this'
        obj.printCurrentFields();

        // Question 2: Print parent class fields using 'super'
        obj.printParentFields();

        // Question 3: Call constructor of current class using this()
        obj.callCurrentClassConstructorUsingThis();

        // Question 4: Call argument constructor of current class using this()
        obj.callArgumentConstructorUsingThis(50, 60);

        // Question 5: Call constructor of the parent class using super()
        obj.callParentClassConstructorUsingSuper();

        // Question 6: Use this() and super() in methods not in constructors
        obj.methodUsingThisAndSuper();
    }
}
