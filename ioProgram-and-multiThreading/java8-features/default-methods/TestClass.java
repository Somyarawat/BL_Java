
interface TestInterface1 {
    default void show(){
        System.out.println("Default Test Interface1");
    }
    static void blowHorn(){
        System.out.println("Horn Please");
    }
}

interface TestInterface2{
    default void show(){
        System.out.println("Default Test Interface2");
    }
}

class TestClass implements TestInterface1, TestInterface2{
    @Override
    public void show(){
        TestInterface1.super.show();
        TestInterface2.super.show();
        System.out.println("I am showing deafult methods");
    }
    public static void main(String[] args) {
        TestClass test = new TestClass();
        test.show();
        TestInterface1.blowHorn();
    }
}