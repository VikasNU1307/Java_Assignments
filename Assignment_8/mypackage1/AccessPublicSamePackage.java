package Assignment_8.mypackage1;



public class AccessPublicSamePackage {
    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        System.out.println("Public Field: " + obj.publicField);
        obj.publicMethod();
    }
}

