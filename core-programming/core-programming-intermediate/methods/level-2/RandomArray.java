class RandomArray {

    public static int[] generate(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000;
        }
        return arr;
    }

    public static double[] analyze(int[] arr) {
        int sum = 0;
        int min = arr[0];
        int max = arr[0];

        for (int x : arr) {
            sum += x;
            if (x < min) min = x;
            if (x > max) max = x;
        }

        double avg = (double) sum / arr.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] arr = generate(5);
        double[] res = analyze(arr);

        System.out.println("Avg = " + res[0]);
        System.out.println("Min = " + res[1]);
        System.out.println("Max = " + res[2]);
    }
}