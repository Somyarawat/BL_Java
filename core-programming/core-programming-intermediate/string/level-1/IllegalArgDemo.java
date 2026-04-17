class IllegalArgDemo {

    public static void generate(String str) {
        System.out.println(str.substring(5, 2));
    }

    public static void handle(String str) {
        try {
            System.out.println(str.substring(5, 2));
        } catch (Exception e) {
            System.out.println("Handled IllegalArgumentException");
        }
    }

    public static void main(String[] args) {
        String text = "HelloWorld";

        handle(text);
    }
}