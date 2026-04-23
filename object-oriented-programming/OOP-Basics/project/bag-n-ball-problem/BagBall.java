import java.util.Scanner;

class Ball {

    private final String color;

    static int totalBalls = 0;

    Ball(String color) {
        this.color = color;
        totalBalls++;
    }

    void display() {
        System.out.println("Ball Color: " + color);
    }

    static void showTotalBalls() {
        System.out.println("Total Balls Created: " + totalBalls);
    }
}

class Bag {

    private final Ball[] balls;
    private int count = 0;

    Bag(int size) {
        balls = new Ball[size];
    }

    public void addBall(Ball b) {
        if (count < balls.length) {
            balls[count] = b;
            count++;
        } else {
            System.out.println("Bag is full!");
        }
    }

    public void displayBalls() {
        System.out.println("\nBalls in Bag:");
        for (int i = 0; i < count; i++) {
            balls[i].display();
        }
    }

    public void countBalls() {
        System.out.println("Balls in bag: " + count);
    }
}

public class BagBall {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter bag size: ");
        int size = sc.nextInt();

        Bag bag = new Bag(size);

        for (int i = 0; i < size; i++) {

            System.out.print("Enter color of ball " + (i+1) + ": ");
            String color = sc.next();

            Ball b = new Ball(color);

            if (b instanceof Ball) {
                bag.addBall(b);
            }
        }

        bag.displayBalls();
        bag.countBalls();


        Ball.showTotalBalls();

    }
}