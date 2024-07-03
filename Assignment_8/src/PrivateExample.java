package Assignment_8.src;


class PrivateExample {
    private int privateField = 10;

    private void privateMethod() {
        System.out.println("This is a private method");
    }

    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        System.out.println("Private Field: " + obj.privateField);
        obj.privateMethod();
    }
}
