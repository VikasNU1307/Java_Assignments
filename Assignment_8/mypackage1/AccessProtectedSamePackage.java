package Assignment_8.mypackage1;



public class AccessProtectedSamePackage {
    public static void main(String[] args) {
        ProtectedExample obj = new ProtectedExample();
        System.out.println("Protected Field: " + obj.protectedField);
        obj.protectedMethod();
    }
}
