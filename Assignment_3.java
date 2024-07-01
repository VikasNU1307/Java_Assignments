// 1. Write a program to print “Bright IT Career” ten times using for loop
class PrintBrightITCareer {
    void printTenTimes() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Bright IT Career");
        }
    }
}

// 2. Write a java program to print 1 to 20 numbers using the while loop.
class PrintNumbersWhile {
    void printOneToTwenty() {
        int i = 1;
        while (i <= 20) {
            System.out.println(i);
            i++;
        }
    }
}

// 3. Program to equal operator and not equal operators
class EqualityOperatorsLoop {
    void equalityCheck() {
        int a = 10, b = 20;
        System.out.println("Is a equal to b? " + (a == b));
        System.out.println("Is a not equal to b? " + (a != b));
    }
}

// 4. Write a program to print the odd and even numbers.
class PrintOddEven {
    void printOddEvenNumbers() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
    }
}

// 5. Write a program to print largest number among three numbers.
class LargestNumber {
    void findLargest(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println("Largest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest number is: " + b);
        } else {
            System.out.println("Largest number is: " + c);
        }
    }
}

// 6. Write a program to print even number between 10 and 100 using while
class EvenNumbersWhile {
    void printEvenNumbers() {
        int i = 10;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

// 7. Write a program to print 1 to 10 using the do-while loop statement.
class PrintOneToTenDoWhile {
    void printNumbers() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}

// 8. Write a program to find Armstrong number or not
class ArmstrongNumber {
    void checkArmstrong(int num) {
        int originalNum, remainder, result = 0;
        originalNum = num;
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, 3);
            originalNum /= 10;
        }
        if (result == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}

// 9. Write a program to find the prime or not.
class PrimeNumber {
    void checkPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}

// 10. Write a program to palindrome or not.
class Palindrome {
    void checkPalindrome(String str) {
        String reverseStr = new StringBuilder(str).reverse().toString();
        if (str.equals(reverseStr)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}

// 11. Program to check whether a number is EVEN or ODD using switch
class EvenOddSwitch {
    void checkEvenOdd(int num) {
        switch (num % 2) {
            case 0:
                System.out.println(num + " is even.");
                break;
            case 1:
                System.out.println(num + " is odd.");
                break;
        }
    }
}

// 12. Print gender (Male/Female) program according to given M/F using switch
class GenderSwitch {
    void printGender(char gender) {
        switch (gender) {
            case 'M':
                System.out.println("Gender is Male.");
                break;
            case 'F':
                System.out.println("Gender is Female.");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}

// 13. Program for multiple if else statement (Largest number in 10, 20, and 30)
class LargestNumberIfElse {
    void findLargest(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println("Largest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest number is: " + b);
        } else {
            System.out.println("Largest number is: " + c);
        }
    }
}

class Assignment_3 {
    public static void main(String[] args) {
        // Question 1 Object Creation
        PrintBrightITCareer obj1 = new PrintBrightITCareer();
        obj1.printTenTimes();

        // Question 2 Object Creation
        PrintNumbersWhile obj2 = new PrintNumbersWhile();
        obj2.printOneToTwenty();

        // Question 3 Object Creation
        EqualityOperatorsLoop obj3 = new EqualityOperatorsLoop();
        obj3.equalityCheck();

        // Question 4 Object Creation
        PrintOddEven obj4 = new PrintOddEven();
        obj4.printOddEvenNumbers();

        // Question 5 Object Creation
        LargestNumber obj5 = new LargestNumber();
        obj5.findLargest(10, 20, 30);

        // Question 6 Object Creation
        EvenNumbersWhile obj6 = new EvenNumbersWhile();
        obj6.printEvenNumbers();

        // Question 7 Object Creation
        PrintOneToTenDoWhile obj7 = new PrintOneToTenDoWhile();
        obj7.printNumbers();

        // Question 8 Object Creation
        ArmstrongNumber obj8 = new ArmstrongNumber();
        obj8.checkArmstrong(153);

        // Question 9 Object Creation
        PrimeNumber obj9 = new PrimeNumber();
        obj9.checkPrime(17);

        // Question 10 Object Creation
        Palindrome obj10 = new Palindrome();
        obj10.checkPalindrome("madam");

        // Question 11 Object Creation
        EvenOddSwitch obj11 = new EvenOddSwitch();
        obj11.checkEvenOdd(29);

        // Question 12 Object Creation
        GenderSwitch obj12 = new GenderSwitch();
        obj12.printGender('M');

        // Question 13 Object Creation
        LargestNumberIfElse obj13 = new LargestNumberIfElse();
        obj13.findLargest(10, 20, 30);
    }
}
