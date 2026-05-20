class MultipleBound{
    public static<T extends Number & Comparable<T>> T findMax(T x, T y){
        return (x.compareTo(y) > 0) ? x : y;
    }
    public static void main(String[] args) {
        System.out.println(findMax(10, 20));
    }
}