import java.util.Scanner;

class BMI2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[][] data = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            data[i][0] = sc.nextDouble(); // weight
            data[i][1] = sc.nextDouble(); // height

            double h = data[i][1] / 100;
            data[i][2] = data[i][0] / (h * h);

            if (data[i][2] < 18.5) status[i] = "Underweight";
            else if (data[i][2] < 25) status[i] = "Normal";
            else status[i] = "Overweight";
        }

        for (int i = 0; i < n; i++) {
            System.out.println(data[i][0] + " " + data[i][1] + " " + data[i][2] + " " + status[i]);
        }
    }
}