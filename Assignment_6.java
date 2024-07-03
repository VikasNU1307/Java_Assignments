public class Assignment_6 {

    public static void main(String[] args) {
        // Question 1: Different ways of creating a string
        String str1 = "Hello";
        String str2 = new String("World");

        // Question 2: Concatenating two strings using + operator
        String concatenated = str1 + " " + str2;

        // Question 3: Finding the length of the string
        int length = concatenated.length();

        // Question 4: Extracting a substring
        String substring = concatenated.substring(6);

        // Question 5: Searching in strings using indexOf()
        int index = concatenated.indexOf("World");

        // Question 6: Matching a string against a regular expression with matches()
        boolean match = concatenated.matches(".*world.*");

        // Question 7: Comparing strings using equals(), equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
        boolean isEqual = str1.equals(str2);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase("HELLO");
        boolean startsWith = str1.startsWith("He");
        boolean endsWith = str2.endsWith("ld");
        int compareTo = str1.compareTo(str2);

        // Question 8: Trimming strings with trim()
        String withSpaces = "   Trim me   ";
        String trimmed = withSpaces.trim();

        // Question 9: Replacing characters in strings with replace()
        String replaced = str1.replace('H', 'J');

        // Question 11: Splitting strings with split()
        String sentence = "Hello, world!";
        String[] parts = sentence.split(",");

        // Question 12: Converting Numbers to Strings with valueOf()
        int num = 12345;
        String numStr = String.valueOf(num);

        // Question 13: Converting integer objects to Strings
        Integer integerObj = 6789;
        String integerStr = integerObj.toString();

        // Question 14: Converting to uppercase and lowercase
        String uppercase = str1.toUpperCase();
        String lowercase = str2.toLowerCase();

        // Printing results
        System.out.println("Concatenated string: " + concatenated);
        System.out.println("Length of concatenated string: " + length);
        System.out.println("Substring from index 6: " + substring);
        System.out.println("Index of 'World': " + index);
        System.out.println("String matches '.*world.*': " + match);
        System.out.println("str1 equals str2: " + isEqual);
        System.out.println("str1 equalsIgnoreCase 'HELLO': " + isEqualIgnoreCase);
        System.out.println("str1 startsWith 'He': " + startsWith);
        System.out.println("str2 endsWith 'ld': " + endsWith);
        System.out.println("str1 compared to str2: " + compareTo);
        System.out.println("Original string with spaces: '" + withSpaces + "'");
        System.out.println("Trimmed string: '" + trimmed + "'");
        System.out.println("Replacing 'H' with 'J': " + replaced);
        System.out.println("Splitting 'Hello, world!': ");
        for (String part : parts) {
            System.out.println(part);
        }
        System.out.println("Number to String conversion: " + numStr);
        System.out.println("Integer object to String conversion: " + integerStr);
        System.out.println("Uppercase of str1: " + uppercase);
        System.out.println("Lowercase of str2: " + lowercase);
    }
}
