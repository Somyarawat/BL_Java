import java.util.*;

class CalendarProgram {

    // Get month name
    public static String getMonthName(int m) {
        String[] months = {"January","February","March","April","May","June",
                           "July","August","September","October","November","December"};
        return months[m - 1];
    }

    // Check leap year
    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Get days in month
    public static int getDays(int m, int year) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        if (m == 2 && isLeap(year)) return 29;
        return days[m - 1];
    }

    // Get first day using formula
    public static int getFirstDay(int m, int y) {
        int d = 1;

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        int d0 = (d + x + (31 * m0)/12) % 7;
        return d0; // 0 = Sunday
    }

    // Display calendar
    public static void display(int m, int y) {
        System.out.println("\n   " + getMonthName(m) + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(m, y);
        int days = getDays(m, y);

        // spaces
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        for (int i = 1; i <= days; i++) {
            System.out.printf("%3d ", i);

            if ((i + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int year = sc.nextInt();

        display(month, year);
    }
}