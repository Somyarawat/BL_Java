import java.util.*;

class Line {
    final int x1, x2, y1, y2;
    static int count = 0;

    Line(int x1, int x2, int y1, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        count++;
    }

    double calculateLength(){
        return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)) );
    }

    void display() {
        System.out.println("Line : (" + x1 + "," + y1 + ") to (" + x2 + "," + y2 + ")");
    }
    static void lineCount(){
        System.out.println("Total Lines Created: " + count);
    }
}

@SuppressWarnings("unused")
class LineComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter line 1 (x1 y1 x2 y2): ");
        Line l1 = new Line(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.print("Enter line 2 (x3 y3 x4 y4): ");
        Line l2 = new Line(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

        if(l1 instanceof Line && l2 instanceof Line){
            l1.display();
            l2.display();

            double len1 = l1.calculateLength();
            double len2 = l2.calculateLength();

            System.out.println("Length 1: " + len1);
            System.out.println("Length 2: " + len2);

            if(len1 > len2)
                System.out.println("Line 1 is longer");
            else if(len1 < len2)
                System.out.println("Line 2 is longer");
            else
                System.out.println("Line 1 is equal to Line 2");
        }
        Line.lineCount();
    }
}