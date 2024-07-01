// 1. Write a function for arithmetic operators(+,-,*,/)
class ArithmeticOperators {
    void performOperations() {
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
    }
}

// 2. Write a method for increment and decrement operators(++, --)
class IncrementDecrementOperators {
    void incrementDecrement() {
        int a = 10;
        System.out.println("Initial value: " + a);
        a++;
        System.out.println("After increment: " + a);
        a--;
        System.out.println("After decrement: " + a);
    }
}

// 3. Program to equal operator and not equal operators
class EqualityOperators {
    void equalityCheck() {
        int a = 10, b = 20;
        System.out.println("Is a equal to b? " + (a == b));
        System.out.println("Is a not equal to b? " + (a != b));
    }
}

// 4. Write a program to find the two numbers equal or not.
class NumberEquality {
    void checkEquality(int a, int b) {
        if (a == b) {
            System.out.println("The numbers are equal.");
        } else {
            System.out.println("The numbers are not equal.");
        }
    }
}

// 5. Programs on Logical AND, OR operator and Logical NOT
class LogicalOperators {
    void logicalOperations() {
        boolean x = true, y = false;
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));
    }
}

// 6. Program for relational operators (<, <=, >, >=)
class RelationalOperators {
    void relationalOperations() {
        int a = 10, b = 20;
        System.out.println("a < b: " + (a < b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a >= b: " + (a >= b));
    }
}

// 7. Print the smaller and larger number
class CompareNumbers {
    void compare(int a, int b) {
        if (a > b) {
            System.out.println("Larger number: " + a);
            System.out.println("Smaller number: " + b);
        } else if (a < b) {
            System.out.println("Larger number: " + b);
            System.out.println("Smaller number: " + a);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}

class Assignment_2 {
    public static void main(String[] args) {
        // Question 1 Object Creation
        ArithmeticOperators obj1 = new ArithmeticOperators();
        obj1.performOperations();

        // Question 2 Object Creation
        IncrementDecrementOperators obj2 = new IncrementDecrementOperators();
        obj2.incrementDecrement();

        // Question 3 Object Creation
        EqualityOperators obj3 = new EqualityOperators();
        obj3.equalityCheck();

        // Question 4 Object Creation
        NumberEquality obj4 = new NumberEquality();
        obj4.checkEquality(10, 20);

        // Question 5 Object Creation
        LogicalOperators obj5 = new LogicalOperators();
        obj5.logicalOperations();

        // Question 6 Object Creation
        RelationalOperators obj6 = new RelationalOperators();
        obj6.relationalOperations();

        // Question 7 Object Creation
        CompareNumbers obj7 = new CompareNumbers();
        obj7.compare(10, 20);
    }
}
