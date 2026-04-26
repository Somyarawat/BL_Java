interface Worker {
    void performDuties();
}

class Person {
    String name;
    @SuppressWarnings("unused")
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    @SuppressWarnings("override")
    public void performDuties() {
        System.out.println(name + " cooks food");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    @SuppressWarnings("override")
    public void performDuties() {
        System.out.println(name + " serves food");
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Worker w1 = new Chef("Rahul", 1);
        Worker w2 = new Waiter("Aman", 2);

        w1.performDuties();
        w2.performDuties();
    }
}