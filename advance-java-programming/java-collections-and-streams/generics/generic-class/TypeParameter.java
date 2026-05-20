class Type <T> {
    T obj;

    Type(T obj){
        this.obj = obj;
    }

    T getObject(){
        return this.obj;
    }
}
@SuppressWarnings("unused")
class TypeParameter {
    public static void main(String[] args) {
        Type<String> sObj1 = new Type<>("Somya");
        System.out.println(sObj1.getObject());

        Type<String> sObj2 = new Type<>("Kartikey");
        System.out.println(sObj2.getObject());
    }    
}
