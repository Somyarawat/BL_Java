class Circle{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    void calculate(){
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Area of Circle: " + area);
        System.out.println("Circumference of Circle: " + circumference);
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.calculate();
    }
}