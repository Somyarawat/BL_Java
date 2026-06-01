import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
class FileMissingException extends RuntimeException {
    public FileMissingException(String message) {
        super(message);
    }
}
public class FileDemo {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void readFile(String fileName) {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            System.out.println("File Contents:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } 
        catch (FileNotFoundException e) { 
            throw new FileMissingException(
                "Custom Unchecked Exception: File '" + fileName + "' not found."
            );
        } 
        catch (IOException e) { 
            System.out.println("Error while reading file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            readFile("sample.txt");
        } 
        catch (FileMissingException e) {
            System.out.println(e.getMessage());
        } 
        finally {
            System.out.println("Program execution completed.");
        }
    }
}