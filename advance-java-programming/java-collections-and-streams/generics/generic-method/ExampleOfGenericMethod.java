class ExampleOfGenericMethod {
    static <T> void display(T elements){
        System.out.println(elements.getClass().getName() + " = " + elements);
    }

    public static void main(String[] args) {
        display(26);
        display("Kartikey");
        display("24.22");
    }
}