// Main class Assignment_13 to demonstrate method overloading scenarios
public class Assignment_13 {

    public static void main(String[] args) {
        // Question 1: Methods with same name but different number of parameters of same type
        methodOverload(10);
        methodOverload(20, 30);

        // Question 2: Methods with same name but different number of parameters of different data type
        methodOverload("Hello");
        methodOverload("Hi", 5);

        // Question 3: Methods with same name and same number of parameters of same type
        methodOverload(3.14);
        methodOverload(2.71);

        // Question 4: Methods with same name and same number of parameters of different type
        methodOverload(1, 2.0);
        methodOverload(3.0, 4);

        // Question 5: Methods with same name, number of parameters and data type but different return Type
        System.out.println(methodOverloadInt(5));
        System.out.println(methodOverloadDouble(10.5));
    }

    // Question 1: Methods with same name but different number of parameters of same type
    static void methodOverload(int num) {
        System.out.println("Question 1: methodOverload(int): " + num);
    }

    static void methodOverload(int num1, int num2) {
        System.out.println("Question 1: methodOverload(int, int): " + num1 + ", " + num2);
    }

    // Question 2: Methods with same name but different number of parameters of different data type
    static void methodOverload(String str) {
        System.out.println("Question 2: methodOverload(String): " + str);
    }

    static void methodOverload(String str, int num) {
        System.out.println("Question 2: methodOverload(String, int): " + str + ", " + num);
    }

    // Question 3: Methods with same name and same number of parameters of same type
    static void methodOverload(double num) {
        System.out.println("Question 3: methodOverload(double): " + num);
    }

    static void methodOverload(double num, double num2) {
        System.out.println("Question 3: methodOverload(double, double): " + num + ", " + num2);
    }

    // Question 4: Methods with same name and same number of parameters of different type
    static void methodOverload(int num, double dec) {
        System.out.println("Question 4: methodOverload(int, double): " + num + ", " + dec);
    }

    static void methodOverload(double dec, int num) {
        System.out.println("Question 4: methodOverload(double, int): " + dec + ", " + num);
    }

    // Question 5: Methods with same name, number of parameters and data type but different return Type
    static int methodOverloadInt(int num) {
        return num * num;
    }

    static double methodOverloadDouble(double dec) {
        return dec * dec;
    }
}
