
class MyInterImpl {
    public static void main(String[] args) {
        MyInter i = () -> {
            System.out.println("Implementing functional interface");
            System.out.println("Using lambda");
        };
        i.sayHello();
    }
}