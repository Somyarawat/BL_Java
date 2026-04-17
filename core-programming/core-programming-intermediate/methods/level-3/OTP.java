class OTP {

    public static int generate() {
        return (int)(Math.random() * 900000) + 100000;
    }

    public static boolean unique(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] == arr[j]) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = generate();
            System.out.println(arr[i]);
        }

        System.out.println(unique(arr));
    }
}