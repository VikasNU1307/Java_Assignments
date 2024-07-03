package Assignment_8.mypackage2;

import Assignment_8.mypackage1.PublicExample;

public class AccessPublicDifferentPackage {
    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        System.out.println("Public Field: " + obj.publicField);
        obj.publicMethod();
    }
}
