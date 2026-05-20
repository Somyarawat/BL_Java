class ArrayWithGenerics {
    static <T> void printArray(T[] elements){
        for(T element : elements){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] iArray = {22, 01, 24, 26, 06};
        Character[] cArray = {'S', 'O', 'M', 'Y', 'A'};

        System.out.println("Print Integer Array: ");
        printArray(iArray);

        System.out.println("Print Character Array: ");
        printArray(cArray);
    }
}