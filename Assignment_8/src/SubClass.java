package Assignment_8.src;
class SubClass extends PrivateExample {
    public void accessPrivate() {
        // The following lines will cause an error
        // System.out.println("Private Field: " + privateField);
        // privateMethod();
    }
}
