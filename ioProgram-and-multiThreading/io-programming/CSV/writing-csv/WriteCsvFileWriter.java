
import java.io.FileWriter;
import java.io.IOException;

class WriteCsvFileWriter{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("students.csv");
            fw.write("ID,Name,Age,Course\n");
            fw.write("101,Somya,21,Java\n");
            fw.write("102,Kartikey,22,Python\n");
            fw.write("103,Harshita,22,Java\n");
            fw.write("104,Luv,20,Python\n");
            fw.write("105,Kush,20,Python");
            fw.close();
            System.out.println("CSV file created");
        } catch (IOException e) {
        }
    }
}