
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class ReadCsvScanner{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("students.csv"));
            //sc.useDelimiter(",");
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
                //System.out.println(sc.next());
            }
            sc.close();
        } catch (IOException e) {
        }
    }
}