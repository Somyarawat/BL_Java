import java.util.*;

class BMIProgram {

    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100.0;

            double bmi = weight / (height * height);

            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else status = "Overweight";

            result[i][0] = String.valueOf(weight);
            result[i][1] = String.valueOf(height);
            result[i][2] = String.valueOf(Math.round(bmi * 100.0) / 100.0);
            result[i][3] = status;
        }

        return result;
    }

    public static void display(String[][] arr) {
        System.out.println("Weight Height BMI Status");
        for (String[] row : arr) {
            System.out.println(row[0] + " " + row[1] + " " + row[2] + " " + row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[3][2];

        for (int i = 0; i < 3; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }

        String[][] result = calculateBMI(data);
        display(result);
    }
}