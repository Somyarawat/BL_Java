import java.util.Scanner;

class BMIProgram {

    public static double calculateBMI(double weight, double heightCm) {
        double h = heightCm / 100;
        return weight / (h * h);
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else return "Overweight";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            double w = sc.nextDouble();
            double h = sc.nextDouble();

            double bmi = calculateBMI(w, h);
            System.out.println("BMI = " + bmi + " Status = " + getStatus(bmi));
        }
    }
}