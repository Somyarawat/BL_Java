import java.util.*;
class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number =sc.nextInt();

        for(int i = 0; i < number; i++) {
            System.out.print("Enter first: ");
            double first = sc.nextDouble();
            System.out.print("Enter Second: ");
            double second = sc.nextDouble();
            System.out.print("Enter Operator (+, -, *, /): ");
            String op = sc.next();

            switch (op) {
                case "+" :
                    System.out.println("Result: " + (first + second));
                    break;
                case "-" :
                    System.out.println("Result: " + (first - second));
                    break;  
                case "*" :
                    System.out.println("Result: " + (first * second));
                    break;
                case "/":
                    if(second != 0){
                        System.out.println("Result: " + (first / second));
                    } 
                    else {
                        System.out.println("Division By Zero");
                        break;
                    }         
                default:
                    System.out.println("Invalid Operator"); 
            }
        }
    }
}