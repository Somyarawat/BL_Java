class CircleChaining {
    double radius;

    CircleChaining(){
        this(1.0);
    }

    CircleChaining(double radius){
        this.radius = radius;
    }

    void display(){
        System.out.println("Radius of Circle: " + radius);
    }

    public static void main(String[] args) {
        CircleChaining c1 = new CircleChaining();
        CircleChaining c2 = new CircleChaining(5);
        c1.display();
        c2.display();
    }
}