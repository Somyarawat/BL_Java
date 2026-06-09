interface Vehicle {
    default void print(){
        System.out.println("I am a vehicle");
    }
}

class Tester implements Vehicle{
    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.print();
    }
}