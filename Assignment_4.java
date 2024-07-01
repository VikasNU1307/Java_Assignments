// 1. Write a function to add integer values of an array

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class AddArrayValues {
    void addValues(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        System.out.println("Sum of array values: " + sum);
    }
}

// 2. Write a function to calculate the average value of an array of integers
class AverageArrayValues {
    void calculateAverage(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        double average = (double) sum / arr.length;
        System.out.println("Average value: " + average);
    }
}

// 3. Write a program to find the index of an array element
class FindArrayIndex {
    void findIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("Index of " + value + ": " + i);
                return;
            }
        }
        System.out.println(value + " not found in the array.");
    }
}

// 4. Write a function to test if array contains a specific value
class ContainsValue {
    void contains(int[] arr, int value) {
        for (int element : arr) {
            if (element == value) {
                System.out.println("Array contains " + value);
                return;
            }
        }
        System.out.println("Array does not contain " + value);
    }
}

// 5. Write a function to remove a specific element from an array
class RemoveElement {
    void remove(int[] arr, int value) {
        int[] result = new int[arr.length - 1];
        int index = 0;
        for (int element : arr) {
            if (element != value) {
                result[index++] = element;
            }
        }
        System.out.println("Array after removing " + value + ": " + Arrays.toString(result));
    }
}

// 6. Write a function to copy an array to another array
class CopyArray {
    void copy(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied array: " + Arrays.toString(copy));
    }
}

// 7. Write a function to insert an element at a specific position in the array
class InsertElement {
    void insert(int[] arr, int value, int position) {
        int[] result = new int[arr.length + 1];
        for (int i = 0, j = 0; i < result.length; i++) {
            if (i == position) {
                result[i] = value;
            } else {
                result[i] = arr[j++];
            }
        }
        System.out.println("Array after insertion: " + Arrays.toString(result));
    }
}

// 8. Write a function to find the minimum and maximum value of an array
class MinMaxArrayValues {
    void findMinMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int value : arr) {
            if (value < min) min = value;
            if (value > max) max = value;
        }
        System.out.println("Minimum value: " + min + ", Maximum value: " + max);
    }
}

// 9. Write a function to reverse an array of integer values
class ReverseArray {
    void reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}

// 10. Write a function to find the duplicate values of an array
class FindDuplicates {
    void findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int value : arr) {
            if (!seen.add(value)) {
                duplicates.add(value);
            }
        }
        System.out.println("Duplicate values: " + duplicates);
    }
}

// 11. Write a program to find the common values between two arrays
class FindCommonValues {
    void findCommon(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        for (int value : arr1) {
            set1.add(value);
        }
        Set<Integer> commonValues = new HashSet<>();
        for (int value : arr2) {
            if (set1.contains(value)) {
                commonValues.add(value);
            }
        }
        System.out.println("Common values: " + commonValues);
    }
}

// 12. Write a method to remove duplicate elements from an array
class RemoveDuplicates {
    void removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int value : arr) {
            set.add(value);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int value : set) {
            result[i++] = value;
        }
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }
}

// 13. Write a method to find the second largest number in an array
class SecondLargestNumber {
    void findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > largest) {
                secondLargest = largest;
                largest = value;
            } else if (value > secondLargest && value != largest) {
                secondLargest = value;
            }
        }
        System.out.println("Second largest number: " + secondLargest);
    }
}

// 14. Write a method to find the second largest number in an array
// (This is a duplicate question and has already been addressed in the class `SecondLargestNumber`)

// 15. Write a method to find number of even number and odd numbers in an array
class CountEvenOdd {
    void countEvenOdd(int[] arr) {
        int evenCount = 0, oddCount = 0;
        for (int value : arr) {
            if (value % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}

// 16. Write a function to get the difference of largest and smallest value
class DifferenceMinMax {
    void findDifference(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int value : arr) {
            if (value < min) min = value;
            if (value > max) max = value;
        }
        int difference = max - min;
        System.out.println("Difference between largest and smallest values: " + difference);
    }
}

// 17. Write a method to verify if the array contains two specified elements (12, 23)
class VerifyTwoElements {
    void verifyElements(int[] arr, int element1, int element2) {
        boolean containsElement1 = false, containsElement2 = false;
        for (int value : arr) {
            if (value == element1) containsElement1 = true;
            if (value == element2) containsElement2 = true;
        }
        if (containsElement1 && containsElement2) {
            System.out.println("Array contains both " + element1 + " and " + element2);
        } else {
            System.out.println("Array does not contain both " + element1 + " and " + element2);
        }
    }
}

// 18. Write a program to remove the duplicate elements and return the new array
// (This is similar to class `RemoveDuplicates`, so we will reuse that class here)

// 19. Write a function to find the missing number of sorted array of 1 to 100
class FindMissingNumber {
    void findMissing(int[] arr) {
        int expectedSum = 100 * 101 / 2; // Sum of first 100 numbers
        int actualSum = 0;
        for (int value : arr) {
            actualSum += value;
        }
        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number: " + missingNumber);
    }
}

class Assignment_4 {
    public static void main(String[] args) {
        // Question 1 Object Creation
        AddArrayValues obj1 = new AddArrayValues();
        obj1.addValues(new int[]{1, 2, 3, 4, 5});

        // Question 2 Object Creation
        AverageArrayValues obj2 = new AverageArrayValues();
        obj2.calculateAverage(new int[]{1, 2, 3, 4, 5});

        // Question 3 Object Creation
        FindArrayIndex obj3 = new FindArrayIndex();
        obj3.findIndex(new int[]{1, 2, 3, 4, 5}, 3);

        // Question 4 Object Creation
        ContainsValue obj4 = new ContainsValue();
        obj4.contains(new int[]{1, 2, 3, 4, 5}, 3);

        // Question 5 Object Creation
        RemoveElement obj5 = new RemoveElement();
        obj5.remove(new int[]{1, 2, 3, 4, 5},5);

                // Question 6 Object Creation
                CopyArray obj6 = new CopyArray();
                obj6.copy(new int[]{1, 2, 3, 4, 5});
        
                // Question 7 Object Creation
                InsertElement obj7 = new InsertElement();
                obj7.insert(new int[]{1, 2, 3, 4, 5}, 10, 2);
        
                // Question 8 Object Creation
                MinMaxArrayValues obj8 = new MinMaxArrayValues();
                obj8.findMinMax(new int[]{1, 2, 3, 4, 5});
        
                // Question 9 Object Creation
                ReverseArray obj9 = new ReverseArray();
                obj9.reverse(new int[]{1, 2, 3, 4, 5});
        
                // Question 10 Object Creation
                FindDuplicates obj10 = new FindDuplicates();
                obj10.findDuplicates(new int[]{1, 2, 3, 2, 4, 5, 4});
        
                // Question 11 Object Creation
                FindCommonValues obj11 = new FindCommonValues();
                obj11.findCommon(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 6, 7, 8});
        
                // Question 12 Object Creation
                RemoveDuplicates obj12 = new RemoveDuplicates();
                obj12.removeDuplicates(new int[]{1, 2, 3, 2, 4, 5, 4});
        
                // Question 13 Object Creation
                SecondLargestNumber obj13 = new SecondLargestNumber();
                obj13.findSecondLargest(new int[]{1, 2, 3, 4, 5});
        
                // Question 14 Object Creation (repeated question, skipped)
        
                // Question 15 Object Creation
                CountEvenOdd obj15 = new CountEvenOdd();
                obj15.countEvenOdd(new int[]{1, 2, 3, 4, 5});
        
                // Question 16 Object Creation
                DifferenceMinMax obj16 = new DifferenceMinMax();
                obj16.findDifference(new int[]{1, 2, 3, 4, 5});
        
                // Question 17 Object Creation
                VerifyTwoElements obj17 = new VerifyTwoElements();
                obj17.verifyElements(new int[]{1, 2, 3, 4, 5}, 12, 23);
        
                // Question 18 Object Creation (repeated question, skipped)
        
                // Question 19 Object Creation
                FindMissingNumber obj19 = new FindMissingNumber();
                obj19.findMissing(new int[]{1, 2, 3, 4, 6, 7, 8, 9, 10}); // Missing number is 5
            }
        
        
        
    }