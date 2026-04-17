class ArrayIndex {

    public static void generate(String[] arr) {
        System.out.println(arr[10]);
    }

    public static void handle(String[] arr) {
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        String[] names = {"A", "B", "C"};

        handle(names);
    }
}