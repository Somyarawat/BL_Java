class LazySingleton{
    private static LazySingleton obj;

    private LazySingleton(){}
    public static LazySingleton getObj(){
        if(obj == null) {
            obj = new LazySingleton();
        }
        return obj;
    }
    public static void main(String[] args) {
        LazySingleton obj1 = LazySingleton.getObj();
        System.out.println(obj1.hashCode());
        LazySingleton obj2 = LazySingleton.getObj();
        System.out.println(obj2.hashCode());
    }
}