class ThreadSafeSingleton{
    private static ThreadSafeSingleton obj;
    private ThreadSafeSingleton(){}

    public static ThreadSafeSingleton getObj(){
        if(obj == null){
            synchronized (ThreadSafeSingleton.class) {
                if(obj == null){
            obj = new ThreadSafeSingleton();
        }
            }
        }
        return obj;
    }
    public static void main(String[] args) {
        ThreadSafeSingleton obj1 = ThreadSafeSingleton.getObj();
        System.out.println(obj1.hashCode());
        ThreadSafeSingleton obj2 = ThreadSafeSingleton.getObj();
        System.out.println(obj2.hashCode());
    }
}