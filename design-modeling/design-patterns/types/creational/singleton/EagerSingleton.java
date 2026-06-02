class EagerSingleton {
    private static final EagerSingleton obj = new EagerSingleton();
    private EagerSingleton(){}

    public static EagerSingleton getObj(){
        return obj;
    }

    public static void main(String[] args) {
        System.out.println(EagerSingleton.getObj().hashCode());
        System.out.println(EagerSingleton.getObj().hashCode());
    }
}