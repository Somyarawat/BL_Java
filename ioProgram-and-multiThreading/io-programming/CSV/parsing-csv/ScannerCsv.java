
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class ScannerCsv {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("students.csv"));
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String[] data = line.split(",");
            for(String value : data){
                System.out.println(value);
            }
            System.out.println();
        }
        sc.close();
    }
}