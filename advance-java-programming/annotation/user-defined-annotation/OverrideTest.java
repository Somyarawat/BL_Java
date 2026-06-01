class Animal{
    void makeSound(){
        System.out.println("Aninmal sound");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Woof");
    }
}
class OverrideTest{
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.makeSound();
    }
}