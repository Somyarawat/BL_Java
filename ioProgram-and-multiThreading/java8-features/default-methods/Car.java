
interface Vehicle{
    default void print(){
        System.out.println("I am a vehicle");
    }
}

interface FourWheeler {
    default void print(){
        System.out.println("I am a four wheeler");
    }
}

class Car implements Vehicle, FourWheeler {

    @Override
    public void print(){
        Vehicle.super.print();
        FourWheeler.super.print();
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.print();
    }
}