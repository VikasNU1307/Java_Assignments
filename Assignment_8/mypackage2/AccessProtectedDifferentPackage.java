package Assignment_8.mypackage2;

import Assignment_8.mypackage1.ProtectedExample;

public class AccessProtectedDifferentPackage extends ProtectedExample {
    public static void main(String[] args) {
        AccessProtectedDifferentPackage obj = new AccessProtectedDifferentPackage();
        System.out.println("Protected Field: " + obj.protectedField);
        obj.protectedMethod();
    }
}
