
class Heights {
    public static int[] generate() {
        int[] arr = new int[11];
        for (int i = 0; i < 11; i++)
            arr[i] = (int)(Math.random() * 101) + 150;
        return arr;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int x : arr) s += x;
        return s;
    }

    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int min(int[] arr) {
        int m = arr[0];
        for (int x : arr) if (x < m) m = x;
        return m;
    }

    public static int max(int[] arr) {
        int m = arr[0];
        for (int x : arr) if (x > m) m = x;
        return m;
    }

    public static void main(String[] args) {
        int[] arr = generate();
        System.out.println(min(arr));
        System.out.println(max(arr));
        System.out.println(mean(arr));
    }
}