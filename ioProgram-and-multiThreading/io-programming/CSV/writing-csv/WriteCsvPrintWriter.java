
import java.io.IOException;
import java.io.PrintWriter;

class WriteCsvPrintWriter{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("students.csv");
            pw.println("ID,Name,Age,Course");
            pw.println("102,Kartikey,22,Python");
            pw.println("103,Harshita,22,Java");
            pw.println("104,Luv,20,Python");
            pw.println("105,Kush,20,Python");
            pw.close();
            System.out.println("Csv Created");
        } catch (IOException e) {
        }
    }
}