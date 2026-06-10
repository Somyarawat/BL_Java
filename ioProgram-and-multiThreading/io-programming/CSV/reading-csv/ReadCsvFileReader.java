import java.io.FileReader;
import java.io.IOException;

class ReadCsvFileReader {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("students.csv");
            int ch;
            while((ch = fr.read()) != -1){
                System.out.println((char)ch);
            }
            fr.close();
        } catch (IOException e) {
        }
    }
}