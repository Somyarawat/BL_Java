
interface FuncInter {
    void abstractFun(int x);
    default void normalFun(){
        System.out.println("Fun activity");
    }
}

class Fun {
    public static void main(String[] args) {
        FuncInter fun = (int x) -> System.out.println(2 * x);
        fun.abstractFun(5);
        fun.normalFun();
    }
}