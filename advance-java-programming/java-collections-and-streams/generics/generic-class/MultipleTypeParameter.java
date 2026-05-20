class MultipleType<T, U> {
    T obj1;
    U obj2;

    MultipleType(T obj1, U obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
@SuppressWarnings("unused")
class MultipleTypeParameter{
    public static void main(String[] args) {
        MultipleType<Integer, String> obj = new MultipleType<>(26, "Kartikey");

        obj.print();
    }
}